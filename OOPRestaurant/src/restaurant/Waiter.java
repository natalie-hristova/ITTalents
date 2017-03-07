package restaurant;

import java.util.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;

import client.Client;

public class Waiter implements Comparable<Waiter> {

	private String name;
	private double money;
	private HashMap<Client, Double> orders = new HashMap();

	public Waiter(String name) {
		this.name = name;
	}

	public Map<Client, Double> getOrders() {
		Map<Client, Double> unmodifiableMap =  Collections.unmodifiableMap(orders);
		return unmodifiableMap;
	}

	public void setOrders(HashMap<Client, Double> orders) {
		this.orders = orders;
	}

	public void removeOrder(Entry<Client, Double> order) {
		orders.remove(order);
	}

	public void getTip(double tip) {
		this.money += tip;
	}

	public void addOrder(Client client, double sum) {
		orders.put(client, sum);

	}

	public double getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return name + "  " + money;
	}

	@Override
	public int compareTo(Waiter w) {
		if ((100 * this.getMoney() - w.getMoney()) == 0) {
			return (w.name.compareTo(this.name));
		}
		return (int) (100 * this.getMoney() - w.getMoney());
	}

}
