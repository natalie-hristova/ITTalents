package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import agency.Agent;
import agency.View;
import property.Property;

public class Buyer extends Client {
	/*
	 * Купувачите имат бюджет, с който разполагат за покупка на имот, както и
	 * списък с огледи, които са направили
	 */
	private double money;
	private HashSet<View> views = new HashSet();

	public Buyer(String name, double money) {
		super(name);
		if (money > 0) {
			this.money = money;
		}
	}

	@Override
	public void register() {
		if (agency == null) {
			System.out.println("Set agency");
		} else {
			this.agent = agency.getRandomAgent();
			agent.addBuyer(this);
		}
	}

	public void declareView(Property property) {
		if (agency == null) {
			System.out.println("Set agency");
		} else {
			if (property.getPrice() < money) {
				View view = new View(property, agent, this);
				views.add(view);
				agent.addView(view);
			}
		}
	}

	public void declareBuy(Property property) {
		if (agency == null) {
			System.out.println("Set agency");
		} else {
			if (isInViews(property)) {
				double moneyForAgency = 0.03 * property.getPrice();
				agency.addMoney(moneyForAgency);// from seller and byuer
				agent.addMoney(moneyForAgency);// from seller and byuer
				this.money -= property.getPrice() + moneyForAgency;
				property.getSeller().getFromMoney(moneyForAgency);
				property.getSeller().addMoney(property.getPrice());
			}
		}
	}

	private boolean isInViews(Property property) {
		if (agency == null) {
			System.out.println("Set agency");
		} else {
			for (Iterator iterator = views.iterator(); iterator.hasNext();) {
				View view = (View) iterator.next();
				if (view.getProperty().equals(property)) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return super.name;
	}

	public Property getPropertyToBuy() {
		Random r = new Random();
		int i = 1;

		if (views.size() > 0) {

			int x = r.nextInt(views.size()) + 1;
			for (Iterator iterator = views.iterator(); iterator.hasNext();) {
				View view = (View) iterator.next();
				if (i == x) {
					return view.getProperty();
				}
				i++;
			}
		}
		return null;
	}
}
