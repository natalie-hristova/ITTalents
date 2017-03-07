package driver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

import gasstation.GasStation;
import vehicle.Vehicle;
import vinetki.Vinetka;
import vinetki.Vinetka.Term;
import vinetki.Vinetka.TypeVehicle;

public class Driver {

	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList();;
	private double money;
	private GasStation gasStation;

	public Driver(String name, double money) {
		if (nameIsValid(name)) {
			this.name = name;
		}
		if (money > 0) {
			this.money = money;
		}
	}

	public Driver(String name, ArrayList<Vehicle> vehicles, double money, GasStation gasStation) {
		if (nameIsValid(name)) {
			this.name = name;
		}
		this.vehicles = vehicles;
		this.money = money;
		this.gasStation = gasStation;
	}

	private boolean nameIsValid(String name) {
		return (name != null && !name.isEmpty());
	}

	public void buyVinetka(Vinetka.Term term, GasStation gs) {
		int i = 0;
		for (Iterator iterator = vehicles.iterator(); iterator.hasNext();) {
			Vehicle vehicle = (Vehicle) iterator.next();
			if (money <= 0) {
				System.out.println("Not enough money for all.Only for " + (i));
				break;
			}
			buyVinetka(i, term, gs);
			i++;
		}
	}

	public ArrayList<Vehicle> getAllWithVehiclesNotValidVinetkas(LocalDate date) {
		ArrayList<Vehicle> notValid = new ArrayList<>();
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getVinetka()!= null) {
				
				if (!vehicles.get(i).getVinetka().isVaid(date)) {
					
					notValid.add(vehicles.get(i));
				}
			}
			
		}
		return notValid;

	}

	public void buyVinetka(int index, Vinetka.Term term, GasStation gs) {
		if (vehicles.size() > index && index >= 0) {
			Vehicle vehicle = vehicles.get(index );
			TypeVehicle type = vehicle.getVinetkaType();
			Vinetka vinetka = new Vinetka(term, type);
			gs.sellVinetka(vinetka);
			vehicle.setVinetka(vinetka);
			this.money -= vinetka.takePrice();
		}
	}

	/*
	 * Да се изведе информация за всички шофьори – колко коли карат, колко от
	 * техните превозни средства имат винетка с изтичащ срок за дадена дата и
	 * колко пари са им останали. - 15т.
	 */
	@Override
	public String toString() {
		return (name + "/n -Money: " + money + " number of cars: " + getNumberOfVehicles() + " need new vinetka:"
				+ getAllWithVehiclesNotValidVinetkas(LocalDate.now()).size()).toString();
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	private int numberOFCars() {
		int count = 0;
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getType().equals(Vehicle.TypeVehicle.CAR)) {
				count++;
			}
		}
		return count;
	}

	public int getNumberOfVehicles() {
		return this.vehicles.size();
	}
}
