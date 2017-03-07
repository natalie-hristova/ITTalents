import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

import driver.Driver;
import gasstation.GasStation;
import vehicle.Vehicle;
import vehicle.Vehicle.TypeVehicle;
import vinetki.Vinetka;
import vinetki.Vinetka.Term;

public class Demo {
	public static void main(String[] args) {

		GasStation gs = new GasStation();
		// gs.printVinetkas();

		/*
		 * Създаване на 20 шофьора с произволни имена. Да им се дадат произволна
		 * стойност пари. Да им се зададе бензиностанция, от която да пазаруват
		 * винетки. - 5т.
		 */

		String[] names = { "Ivan", "Stoyan", "Petkan", "Dragan", "Orhan" };
		ArrayList<Driver> drivers = new ArrayList();
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			int name = r.nextInt(names.length);
			double money = r.nextDouble() * 10_000 + 1_000;
			drivers.add(new Driver(names[name], money));
		}

		/*
		 * Създаване на 200 превозни средства от произволен тип (кола, автобус,
		 * камион) и на всеки шофьор да се дадат по 10 от тях като всяко
		 * превозно средство се управлява от един шофьор. - 10т
		 */

		ArrayList<Vehicle> vehicles = new ArrayList();
		for (int i = 0; i < 200; i++) {
			int v = r.nextInt(3);
			if (v == 0) {
				vehicles.add(new Vehicle(TypeVehicle.BUS));
			}
			if (v == 1) {
				vehicles.add(new Vehicle(TypeVehicle.CAR));
			}
			if (v == 2) {
				vehicles.add(new Vehicle(TypeVehicle.TRUCK));
			}
		}

		for (int i = 0; i < drivers.size(); i++) {
			for (int j = 0; j < 10; j++) {
				int p = r.nextInt(vehicles.size());
				drivers.get(i).addVehicle(vehicles.get(p));
			}
		}
		/*
		 * Всеки 3-ти шофьор на произволен принцип за някои превозни средства да
		 * купи 5 винетки за произволно генериран срок (ден, месец, година).
		 * Останалите шофьори да купят винетки за всичките си превозни средства
		 * за произволно генериран срок. - 10т.
		 */
		HashSet<Integer> hs = new HashSet<Integer>();// za driver
		while (hs.size() <= 5) {
			hs.add(r.nextInt(drivers.size()));
			if (hs.size() == 5) {
				break;
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();// driver 
		list.addAll(hs);
		// --------------------------
		HashSet<Integer> vin = new HashSet<Integer>();
		while (vin.size() <= 5) {
			int x = r.nextInt(drivers.get(0).getNumberOfVehicles());
			vin.add(x);
			if (vin.size() == 5) {
				break;
			}
		}

		ArrayList<Integer> vinList = new ArrayList<Integer>();
		vinList.addAll(vin);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < vinList.size(); j++) {
				int term = r.nextInt(3);
				switch (term) {
				
				case 0:
					drivers.get(i).buyVinetka(vinList.get(j), Term.DAY, gs);
					break;
				case 1:
					drivers.get(i).buyVinetka(vinList.get(j), Term.MONTH, gs);
					break;
				case 2:
					drivers.get(i).buyVinetka(vinList.get(j), Term.YEAR, gs);
					break;

				default:
					break;
				}
			}
		}

		int[] others= new int[15];
		int x = 0;
		for (int i = 0; i < drivers.size(); i++) {
			if (!list.contains((Integer)i)) {
				others[x]=i;
				x++;
			}
		}
		
		for (int i = 0; i < others.length; i++) {
			int term = r.nextInt(3);
			switch (term) {
			case 0:
				drivers.get(i).buyVinetka(Term.MONTH, gs);
				break;
			case 1:
				drivers.get(i).buyVinetka(Term.MONTH, gs);
				break;
			case 2:
				drivers.get(i).buyVinetka(Term.YEAR, gs);
				break;

			default:
				break;
			}
		}
		
		
		for (int i = 0; i < drivers.size(); i++) {
			//System.out.println(drivers.get(i));
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		String date = "16/08/2018";

		//convert String to LocalDate
		LocalDate localDate = LocalDate.parse(date, formatter);
		//gs.printVinetkas();
	for (int i = 0; i < drivers.size(); i++) {
		ArrayList<Vehicle>a =drivers.get(i).getAllWithVehiclesNotValidVinetkas(localDate);
		for (int k = 0; k < a.size(); k++) {
			if (a.get(k).getType()== Vehicle.TypeVehicle.TRUCK) {
				System.out.println(a.get(k));
			}
		}
	}
}
}
