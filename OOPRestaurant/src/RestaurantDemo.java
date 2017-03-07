import java.lang.reflect.Array;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import client.Client;
import client.Mutra;
import client.Student;
import client.Vegan;
import menu.Desert;
import menu.EatAndDrink;
import restaurant.CompareWaitersByMoney;
import restaurant.Restaurant;
import restaurant.Waiter;

public class RestaurantDemo {
	public static void main(String[] args) {

		Waiter w1 = new Waiter("waiter1");
		Waiter w2 = new Waiter("waiter2");
		Waiter w3 = new Waiter("waiter3");
		Waiter w4 = new Waiter("waiter4");
		Waiter w5 = new Waiter("waiter5");
		TreeSet<Waiter> waiters = new TreeSet<Waiter>();
		waiters.add(w1);
		waiters.add(w2);
		waiters.add(w3);
		waiters.add(w4);
		waiters.add(w5);
		Restaurant r = new Restaurant("При Пешо Таланта", 1000, waiters);
		r.printStack();

		ArrayList<Client> clients = new ArrayList();
		Random rand = new Random();
		for (int i = 1; i <= 3; i++) {
			int percent = rand.nextInt(100);
			if (percent <= 19) {
				clients.add(new Student("Student " + i));
			} else if (percent > 50) {
			clients.add(new Mutra("Mutra " + i));
			} else {
				clients.add(new Vegan("Vegan " + i));
			}

		}
		for (Client client : clients) {
			client.enterRestaurant(r);
			client.makeOrder();
			client.askForBill();
			client.payBill();
		}

		System.out.println("Money in restaurant " + r.getMoney());
		double max = -1;
		Waiter w = null;
		for (Iterator iterator = waiters.iterator(); iterator.hasNext();) {
			Waiter waiter = (Waiter) iterator.next();
			if (waiter.getMoney() > max) {
				max = waiter.getMoney();
				w = waiter;
			}
		}
		//System.out.println("Max tips: " + w);
		
		
		//r.printWaitersByMoney(new CompareWaitersByMoney());// does not sort 
	//	r.printStack();
		r.printByNumber();
		//PROBLEM MAKE ORDER IZPRAZVA MISE TVA HAVEINSTACK I E ZNAM ZASHTO
	}
}
