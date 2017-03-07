package restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import menu.Alcohol;
import menu.Desert;
import menu.EatAndDrink;
import menu.MainDish;
import menu.Menu;
import menu.NotAlcohol;
import menu.Salad;

public class Restaurant {

	private String name;
	private double money;
	private Menu menu;
	private TreeSet<Waiter> waiters;

	private TreeMap<String, TreeSet<EatAndDrink>> haveInStack;

	public Restaurant(String name, double money, TreeSet<Waiter> waiters) {
		this.name = name;
		this.money = money;
		this.waiters = waiters;
		initStack();
	}

	private void initStack() {
		this.menu= new Menu();
		this.haveInStack = new TreeMap();
		haveInStack.put("Food", new TreeSet());
		haveInStack.get("Food").addAll(menu.getFood());
		for (Iterator iterator = haveInStack.get("Food").iterator(); iterator.hasNext();) {
			EatAndDrink food = (EatAndDrink) iterator.next();
			
			food.setNumber(10);
		}
	haveInStack.put("Drink", new TreeSet());
	haveInStack.get("Drink").addAll(menu.getDrinks());
	for (Iterator iterator = haveInStack.get("Drink").iterator(); iterator.hasNext();) {
		EatAndDrink drink = (EatAndDrink) iterator.next();
		drink.setNumber(20);
	}
	}

	public void printStack() {
		for (Iterator<Entry<String, TreeSet<EatAndDrink>>> iterator = haveInStack.entrySet().iterator(); iterator
				.hasNext();) {
			Entry<String, TreeSet<EatAndDrink>> menuThing = (Entry<String, TreeSet<EatAndDrink>>) iterator.next();
			System.out.println("-------" + menuThing.getKey() + "-------");
			for (Iterator<EatAndDrink> iterator2 = menuThing.getValue().iterator(); iterator2.hasNext();) {
				EatAndDrink fa = (EatAndDrink) iterator2.next();
				System.out.println(fa);
			}
		}
	}

	public TreeSet<Waiter> getWaiters() {
		return waiters;
	}

	public void addMoney(double money) {
		this.money += money;
	}

	public boolean haveInStack(HashSet<EatAndDrink> order) {
		
		ArrayList<String> orderNames = new ArrayList<>();
		for (Iterator<EatAndDrink> it = order.iterator(); it.hasNext();) {
			EatAndDrink eatAndDrink = (EatAndDrink) it.next();
			orderNames.add(eatAndDrink.getName());
		}
		for (Iterator<TreeSet<EatAndDrink>> iterator = haveInStack.values().iterator(); iterator.hasNext();) {
			TreeSet<EatAndDrink> tfa = (TreeSet<EatAndDrink>) iterator.next();
			for (Iterator<EatAndDrink> iterator2 = tfa.iterator(); iterator2.hasNext();) {
				EatAndDrink fa = (EatAndDrink) iterator2.next();

				if (orderNames.contains(fa.getName())) {
					System.out.println(fa);
					for (Iterator<EatAndDrink> iterator3 = order.iterator(); iterator3.hasNext();) {
						EatAndDrink orderfa = (EatAndDrink) iterator3.next();
					
						if (orderfa.equals(fa) && orderfa.getNumber() > fa.getNumber()) {
							System.out.println(orderfa.getNumber() + "     78rest   " + fa.getNumber());
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	public Map<String, TreeSet<EatAndDrink>> getHaveInStack() {
		return Collections.unmodifiableMap(haveInStack);
	}

	public double getMoney() {
		return money;
	}

	public void printWaitersByMoney(Comparator<Waiter> copmarator) {
		ArrayList<Waiter> list = new ArrayList();
		list.addAll(waiters);
		Collections.sort(list, copmarator);
		for (Waiter entry : list) {
			System.out.println("" + entry);
		}
	}

	public void printByNumber() {
		for (Iterator<Entry<String, TreeSet<EatAndDrink>>> iterator = haveInStack.entrySet().iterator(); iterator
				.hasNext();) {
			Entry<String, TreeSet<EatAndDrink>> fa = (Entry<String, TreeSet<EatAndDrink>>) iterator.next();
			System.out.println("------" + fa.getKey() + "--------");
			ArrayList<EatAndDrink> list = new ArrayList<>();
			for (Iterator iterator2 = fa.getValue().iterator(); iterator2.hasNext();) {
				EatAndDrink eatAndDrink = (EatAndDrink) iterator2.next();
				list.add(eatAndDrink);
			}
			Collections.sort(list, new ComparatorByNumber());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}

	public class ComparatorByNumber implements Comparator<EatAndDrink> {

		@Override
		public int compare(EatAndDrink o1, EatAndDrink o2) {
			return o1.getNumber() - o2.getNumber();
		}

	}

	public Menu GetMenu() {
		return menu;
	}
}
