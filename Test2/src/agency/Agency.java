package agency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import property.Property;

public class Agency {

	private String name;
	private String address;
	private String phoneNumber;
	private double money;
	private TreeSet<Agent> agents = new TreeSet();// като агентите са сортирани
													// от най-богатия
	// към този с най-малко печалби.
	private TreeMap<Property.Category, HashSet<Property>> magazine = new TreeMap();
	private int numberOfPrperties = 0;

	public Agency(String name, TreeSet<Agent> agents) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
		if (agents != null) {
			this.agents = agents;
		}
	}

	public Agent getRandomAgent() {
		Random r = new Random();
		int index = r.nextInt(agents.size());
		int i = 0;
		Agent a = null;
		for (Iterator<Agent> iterator = agents.iterator(); iterator.hasNext();) {
			Agent agent = (Agent) iterator.next();
			if (i == index) {
				a = agent;
			}
			i++;
		}
		return a;
	}

	public void printProperty(Property property) {
		for (Iterator iterator3 = magazine.entrySet().iterator(); iterator3.hasNext();) {
			Entry<Property.Category, HashSet<Property>> cat = (Entry<Property.Category, HashSet<Property>>) iterator3
					.next();
			System.out.println("=======" + cat.getKey() + "=======");
			for (Iterator<Property> iterator2 = cat.getValue().iterator(); iterator2.hasNext();) {
				Property build = (Property) iterator2.next();
				System.out.println("     " + build);
			}

		}
	}

	public void addProperty(Property property) {
		if (this.magazine.containsKey(property.getCategory())) {
			for (Iterator<Entry<Property.Category, HashSet<Property>>> iterator = magazine.entrySet()
					.iterator(); iterator.hasNext();) {
				Entry<Property.Category, HashSet<Property>> catSet = (Entry<Property.Category, HashSet<Property>>) iterator
						.next();
				if (catSet.getKey().equals(property.getCategory())) {
					if (catSet.getValue().contains(property)) {
						System.out.println("You have already registered your property");
						numberOfPrperties--;
					} else {
						catSet.getValue().add(property);
					}
				}
			}
		} else {
			magazine.put(property.getCategory(), new HashSet());
			magazine.get(property.getCategory()).add(property);
		}
		numberOfPrperties++;
	}

	public void printAgentsByMoney() {
		ArrayList<Agent> agentsList = new ArrayList();

		for (Iterator iterator = agents.iterator(); iterator.hasNext();) {
			Agent agent = (Agent) iterator.next();
			agentsList.add(agent);
		}
		Collections.sort(agentsList, new ComparatorAgentsByMoney());
		for (int i = 0; i < agentsList.size(); i++) {
			System.out.println("     " + agentsList.get(i));
		}
	}

	public void addMoney(double d) {
		this.money += d;

	}

	public Property getProperty() {
		Random r = new Random();
		int i = 0;
		int index = r.nextInt(numberOfPrperties);
		for (Iterator iterator = magazine.values().iterator(); iterator.hasNext();) {
			HashSet<Property> all = (HashSet<Property>) iterator.next();
			for (Iterator iterator2 = all.iterator(); iterator2.hasNext();) {
				Property property = (Property) iterator2.next();
				if (i == index) {
					return property;
				}
				i++;
			}
		}
		return null;
	}

	public void printMoney() {
		System.out.println("The money in " + this.name + " is: " + money );
		
	}

}
