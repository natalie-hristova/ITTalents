package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import agency.Agency;
import agency.Agent;
import agency.ComparatorAgentsByMoney;
import agency.View;
import client.Buyer;
import client.Seller;
import property.Apartament;
import property.House;
import property.IType;
import property.Plot;
import property.Property;
import property.Property.BuildType;

public class Demo {
	public static void main(String[] args) {
		Random r = new Random();
		// 1. Да се създаде агенция „Таланти Естейтс“ с пет агента с произволни
		// имена.

		String[] names = { "Pesho", "Misho", "Sasho", "Gosho", "Ivan", "Strahil" };
		TreeSet<Agent> agents = new TreeSet();
		while (agents.size() <= 5) {
			if (agents.size() == 5) {
				break;
			}

			int index = r.nextInt(names.length);
			agents.add(new Agent(names[index]));

		}
		Agency agency = new Agency("Таланти Естейтс", agents);
		ArrayList<Seller> sellers = new ArrayList();

		/**
		 * Да се създадат 30 продавача на имоти. За всеки продавач да се създаде
		 * имот на произволен принцип – 33% шанс да е апартамент, 33% шанс да е
		 * къща и 33% шанс за парцел. Останалите характеристики също да са на
		 * произволен принцип. Цените на имотите да варират – за къщите между 50
		 * 000 и 80 000 евро, за апартаментите – между 70 000 и 150 000 евро; за
		 * парцелите – между 30 000 и 85 000 евро.
		 * 
		 */
		for (int i = 0; i < 30; i++) {
			int p = r.nextInt(3);
			switch (p) {
			case 0: {
				int index = r.nextInt(names.length);
				int price = r.nextInt(80_000) + 70_000;
				sellers.add(new Seller(names[index],
						new Apartament("", "", price, Apartament.ApartamentType.GARSON, 23, BuildType.EPK)));

				break;
			}
			case 2: {
				int index = r.nextInt(names.length);
				int price = r.nextInt(30_000) + 50_000;
				sellers.add(new Seller(names[index],
						new House("", "", price, House.TypeHouse.FLOOR, 23, BuildType.KERPICH)));

				break;
			}
			case 1: {
				int index = r.nextInt(names.length);
				int price = r.nextInt(50_000) + 30_000;
				sellers.add(new Seller(names[index], new Plot("", "", price, Plot.TypePlot.FILED, 23)));
				break;
			}

			default:
				break;
			}
		}
		// 3. Всички продавачи да регистрират имотите си за продажба в
		// агенцията;
		for (Seller seller : sellers) {
			seller.setAgency(agency);
			seller.register();
		}

		// 4. Да се създадат 10 купувача на произволен принцип с бюджети между
		// 30 000 и 150 000 евро;
		ArrayList<Buyer> buyers = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			int index = r.nextInt(names.length);
			int money = r.nextInt(120_000) + 30_000;

			buyers.add(new Buyer(names[index], money));
		}
		// 5. Всички купувачи да регистрират заявки за търсене на имот към
		// агенцията;

		for (Buyer buyer : buyers) {
			buyer.setAgency(agency);
			buyer.register();
		}

		// 6. Всеки купувач да заяви 3 огледа на произволни имоти от агенцията;
		for (Buyer buyer : buyers) {
			for (int j = 0; j < 3; j++) {
				Property p = agency.getProperty();
				buyer.declareView(p);
			}
		}

		// 7. Всеки купувач да заявки покупка на някой от огледаните от него
		// имоти на произволен принцип;
		for (Buyer buyer : buyers) {
			if (buyer.getPropertyToBuy() != null) {
				buyer.declareBuy(buyer.getPropertyToBuy());
			}
		}

		//8. Да се изпише на екрана паричния баланс на агенцията след продажбата
		// на имотите;
		agency.printMoney();
		
		//9.Да се изпише на екрана паричния баланс на всеки агент от агенцията след продажбата
		//на имотите, като агентите са сортирани от най-богатия към този с най-малко печалби
		
		agency.printAgentsByMoney();
	}

}
