package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import menu.EatAndDrink;
import restaurant.Restaurant;
import restaurant.Waiter;

public abstract class Client {

	private String name;
	protected double money;
	protected Restaurant restaurant;
	private Waiter waiter;

	public Client(String name, double money) {
		this.name = name;
		this.money = money;
	}

	public void enterRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	protected boolean isInReastaurant() {
		return (restaurant != null);
	}

	private void chooseWaiter() {
		if (isInReastaurant()) {
			Random r = new Random();
			int choice = r.nextInt(restaurant.getWaiters().size());
			int i = 0;
			for (Iterator iterator = restaurant.getWaiters().iterator(); iterator.hasNext();) {
				Waiter waiter = (Waiter) iterator.next();
				if (choice == i) {
					this.waiter = waiter;
				}
				i++;
			}
		}
	}

	public void makeOrder() {
		HashSet<EatAndDrink> order = generateOrder();
		chooseWaiter();
		double sum = 0;
		for (Iterator<EatAndDrink> iterator = order.iterator(); iterator.hasNext();) {
			EatAndDrink fa = (EatAndDrink) iterator.next();
			sum += fa.getPrice() * fa.getNumber();
		}
		if (restaurant.haveInStack(order)) {
			for (Iterator<TreeSet<EatAndDrink>> iterator = restaurant.getHaveInStack().values().iterator(); iterator
					.hasNext();) {
				TreeSet<EatAndDrink> tfa = (TreeSet<EatAndDrink>) iterator.next();
				for (Iterator<EatAndDrink> iterator2 = tfa.iterator(); iterator2.hasNext();) {
					EatAndDrink eatAndDrink = (EatAndDrink) iterator2.next();

					for (Iterator<EatAndDrink> iterator3 = order.iterator(); iterator3.hasNext();) {
						EatAndDrink eatable = (EatAndDrink) iterator3.next();
						if (eatable.equals(eatAndDrink) && (eatable.getNumber() <= eatAndDrink.getNumber())) {
							eatAndDrink.setNumber(eatAndDrink.getNumber() - eatable.getNumber());
							
						}
					}
				}
			}
			waiter.addOrder(this, sum);
		}else
System.out.println("Not in stack");
	}


	public double askForBill() {
		Map<Client, Double> clients = waiter.getOrders();
		if (clients.keySet().contains(this)) {
			
			for (Iterator<Entry<Client, Double>> iterator = waiter.getOrders().entrySet().iterator(); iterator
					.hasNext();) {
				Entry<Client, Double> client = (Entry<Client, Double>) iterator.next();
				if (client.getKey().equals(this)) {
					waiter.removeOrder(client);
					return client.getValue();
				}
			}
		}
		return 0;
	}
	
	 protected abstract ArrayList<EatAndDrink>  canOrder();
	 
	 
	protected HashSet<EatAndDrink> generateOrder() {
		ArrayList<EatAndDrink> order = (ArrayList<EatAndDrink>) canOrder().clone();
		System.out.println("103 kli net " + order);
		HashMap<EatAndDrink, Integer> ord = new HashMap();

		HashSet<EatAndDrink> set = new HashSet<>();
		double moneyToSpend = 0.9 * money;
		if (isInReastaurant()) {
			Random r = new Random();

			while (moneyToSpend > 0) {
				int index = r.nextInt(order.size());
				EatAndDrink newToOrder = order.get(index);
				if (!ord.containsKey(newToOrder)) {
					ord.put(newToOrder, 1);
				} else {
					ord.put(newToOrder, ord.get(newToOrder) + 1);
				}
				double c = moneyToSpend;
				if (c - order.get(index).getPrice() > 0) {
					moneyToSpend -= order.get(index).getPrice();
				} else
					break;

			}
			for (Iterator<Entry<EatAndDrink, Integer>> iterator2 = ord.entrySet().iterator(); iterator2.hasNext();) {
				Entry<EatAndDrink, Integer> ordThing = (Entry<EatAndDrink, Integer>) iterator2.next();
				int x = ordThing.getValue();
				EatAndDrink s = ordThing.getKey();
				s.setNumber(x);
				set.add(s);
			}
		}
		return set;
	}


	public void payBill() {

		double bill = askForBill();
		System.out.println(this + "'s Bill: " + bill);
		Random r = new Random();
		int probability = r.nextInt(100);
		if (probability < 80) {// he will give tip
			int percent = r.nextInt(6) + 5;
			double tip = (bill * percent) / 100;
			waiter.getTip(tip);
			money-= tip;
		}
		restaurant.addMoney(bill);
		money -= bill ;

	}

	@Override
	public String toString() {
		return name;
	}

}
