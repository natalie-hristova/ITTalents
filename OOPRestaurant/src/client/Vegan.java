package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import menu.EatAndDrink;
import menu.IMutra;
import menu.IVegan;

public class Vegan extends Client {

	public Vegan(String name) {
		super(name, 30);
	}

	protected ArrayList<EatAndDrink> canOrder() {
		ArrayList<EatAndDrink> order = new ArrayList<>();
		if (isInReastaurant()) {
			for (Iterator iterator = restaurant.GetMenu().getFood().iterator(); iterator.hasNext();) {
				EatAndDrink food = (EatAndDrink) iterator.next();
				if (food instanceof IVegan) {
					order.add(food);
				}
			}
			for (Iterator iterator =  restaurant.GetMenu().getDrinks().iterator(); iterator.hasNext();) {
				EatAndDrink drink = (EatAndDrink) iterator.next();
				if (drink instanceof IVegan) {
					order.add(drink);
				}
			}

		}
		return order;

	}

	
}
