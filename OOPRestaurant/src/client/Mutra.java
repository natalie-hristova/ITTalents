package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import menu.Drink;
import menu.EatAndDrink;
import menu.IMutra;

public class Mutra extends Client {

	public Mutra(String name) {
		super(name, 50);
	}

	protected ArrayList<EatAndDrink> canOrder() {
		ArrayList<EatAndDrink> order = new ArrayList<>();
		if (isInReastaurant()) {
			for (Iterator iterator = restaurant.GetMenu().getFood().iterator(); iterator.hasNext();) {
				EatAndDrink food = (EatAndDrink) iterator.next();
				if (food instanceof IMutra) {
					food.setNumber(0);
					order.add(food);
				}
			}
			for (Iterator iterator =  restaurant.GetMenu().getDrinks().iterator(); iterator.hasNext();) {
				EatAndDrink drink = (EatAndDrink) iterator.next();
				if (drink instanceof IMutra) {
					order.add(drink);
				}
			}

		}
		return order;

	}
	
}
