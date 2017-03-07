package gasstation;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import vinetki.Vinetka;
import vinetki.Vinetka.Term;

public class GasStation {

	private double money;
	private TreeMap<Vinetka,Integer> vinetkas;//

	
	public GasStation(){
		initVinetkas();
	}
	
	
	public void sellVinetka(Vinetka vinetka){
		if (vinetkas.containsKey(vinetka)) {
			for (Iterator<Entry<Vinetka,Integer>> iterator = vinetkas.entrySet().iterator(); iterator.hasNext();) {
				Entry<Vinetka,Integer> type = (Entry<Vinetka,Integer>) iterator.next();
				if (type.getKey().equals(vinetka) && type.getValue()>0) {
					this.money+=type.getKey().takePrice();
					type.setValue( type.getValue()-1);
				}	
			}
		//	System.out.println("Not in stack");
		}
		
	}

	private void initVinetkas() {
		vinetkas = new TreeMap<>();
		for (int i = 0; i < 10_000; i++) {
			Vinetka vinetka = new Vinetka(generateTerm(),generateType());
			if (vinetkas.containsKey(vinetka)) {
				vinetkas.put(vinetka,vinetkas.get(vinetka)+1);
			}else{
				vinetkas.put(vinetka,1);
			}
		}
	}
	
	public void printVinetkas(){
		System.out.println("-----VINETKAS------");
		int number = 0;
		for (Iterator<Entry<Vinetka,Integer>> iterator = vinetkas.entrySet().iterator(); iterator.hasNext();) {
			Entry<Vinetka,Integer> vinetka = (Entry<Vinetka,Integer>) iterator.next();
			for (int i = 0; i <vinetka.getValue(); i++) {
				System.out.println("  "+vinetka.getKey());
				number++;
			}
		}
		System.out.println("Number of vinetkas " + number);
	}
	
	
	private Term generateTerm() {
		Random x = new Random();
		int y = x.nextInt(3);
		switch (y) {
		case 0:
			return  Vinetka.Term.DAY;
		case 1:
			return  Vinetka.Term.MONTH;
		case 2:
			return  Vinetka.Term.YEAR;
		default:
			return null;
		}
	}

	private Vinetka.TypeVehicle generateType(){
		Random x = new Random();
		int y = x.nextInt(3);
		switch (y) {
		case 0:
			return  Vinetka.TypeVehicle.BUS;
		case 1:
			return  Vinetka.TypeVehicle.CAR;
		case 2:
			return  Vinetka.TypeVehicle.TRUCK;
		default:
			return null;
		}
		
	}
}
