package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import menu.EatAndDrink;
import menu.IVegan;

public class Student extends Client {

	public Student(String name) {
		super(name,10);
	}

	protected ArrayList<EatAndDrink> canOrder() {
		ArrayList<EatAndDrink> order = new ArrayList<>();
		if (isInReastaurant()) {
			for (Iterator iterator = restaurant.GetMenu().getFood().iterator(); iterator.hasNext();) {
				EatAndDrink food = (EatAndDrink) iterator.next();
					food.setNumber(0);
					order.add(food);
			}
			for (Iterator iterator =  restaurant.GetMenu().getDrinks().iterator(); iterator.hasNext();) {
				EatAndDrink drink = (EatAndDrink) iterator.next();
					drink.setNumber(0);
					order.add(drink);
			}

		}
		return order;

	}
//	@Override
//	protected HashSet<EatAndDrink> generateOrder() {
//		ArrayList<EatAndDrink> order = canOrder();
//		HashMap<EatAndDrink, Integer> ord = new HashMap();
//
//		HashSet<EatAndDrink> set = new HashSet<>();
//		double moneyToSpend = 0.9 * money;
//		if (isInReastaurant()) {
//			Random r = new Random();
//
//			while (moneyToSpend > 0) {
//				int index = r.nextInt(order.size());
//				EatAndDrink newToOrder = order.get(index);
//				if (!ord.containsKey(newToOrder)) {
//					ord.put(newToOrder, 1);
//				} else {
//					ord.put(newToOrder, ord.get(newToOrder) + 1);
//				}
//				double c = moneyToSpend;
//				if (c - order.get(index).getPrice() > 0) {
//					moneyToSpend -= order.get(index).getPrice();
//				} else
//					break;
//
//			}
//			for (Iterator<Entry<EatAndDrink, Integer>> iterator2 = ord.entrySet().iterator(); iterator2.hasNext();) {
//				Entry<EatAndDrink, Integer> ordThing = (Entry<EatAndDrink, Integer>) iterator2.next();
//				int x = ordThing.getValue();
//				EatAndDrink s = ordThing.getKey();
//				s.setNumber(x);
//				set.add(s);
//			}
//			
//		}
//		return set;
//	}
}
