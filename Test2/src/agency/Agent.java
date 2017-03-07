package agency;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import client.Buyer;
import client.Seller;

public class Agent implements Comparable<Agent> {

	private String name;
	private String phoneNumber;
	private HashSet<Buyer> buyers= new HashSet();
	private HashSet<Seller> sellers= new  HashSet();
	private HashSet<View> views = new HashSet();
	private static int number = 1;
	private double money;

	public Agent(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		} else {
			this.name = "Anonimous Agent: " + number;
			number++;
		}
	}

	@Override
	public int compareTo(Agent c) {
		return this.name.compareTo(c.name);
	}

	public double getMoney() {
		return money;
	}

	public void addSeller(Seller seller) {
		sellers.add(seller);

	}

	public void addBuyer(Buyer buyer) {
		this.buyers.add(buyer);
		
	}

	public void addView(View view) {
		views.add(view);
	}

	public Set getViews() {
		return Collections.unmodifiableSet(views);
	}

	public void addMoney(double d) {
		this.money+=d;
	}
	
	@Override
	public String toString() {
		return name + " - " + money;
	}
}
