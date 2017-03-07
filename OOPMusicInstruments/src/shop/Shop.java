package shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import instruments.*;
import saplier.Saplier;

public class Shop {

	private double money = 0;
	private TreeMap<String, TreeSet<MusicInstrument>> instruments;
	Saplier s= new Saplier();

	public Shop() {
		instruments = new TreeMap();
		instruments.put("Strunni", new TreeSet());
		instruments.put("Duhovi", new TreeSet());
		instruments.put("Klavishni", new TreeSet());
		//instruments.put("Udarni", new TreeSet());
		instruments.put("Elektronni", new TreeSet());
		instruments.get("Strunni").add(new Guitar(300, 5, "My Guitar"));
		instruments.get("Strunni").add(new Viola(1200, 7, "My viola"));
	//	instruments.get("Udarni").add(new Daire(300, 5, "My daire"));
	//	instruments.get("Udarni").add(new Tupan(1349, 7, "My tupan"));
		instruments.get("Klavishni").add(new Piano(120, 12, "My piano"));
		instruments.get("Duhovi").add(new Kaval(150, 17, "My kaval"));
		instruments.get("Elektronni").add(new Sintezator(4000, 1, "My sintezator"));
	}

	public void orderedByType() {
		System.out.println("====By Type====");
		for (Iterator<Entry<String, TreeSet<MusicInstrument>>> it = instruments.entrySet().iterator(); it.hasNext();) {
			Entry<String, TreeSet<MusicInstrument>> e = it.next();
			System.out.println("------" + e.getKey() + "------");
			for (Iterator<MusicInstrument> iterator = e.getValue().iterator(); iterator.hasNext();) {
				MusicInstrument currentInstrument = (MusicInstrument) iterator.next();
				System.out.println("    " + currentInstrument);

			}
		}
	}

	public void printInfo(Comparator<MusicInstrument> copmarator) {
		ArrayList<MusicInstrument> list = new ArrayList();
		for (Iterator<Entry<String, TreeSet<MusicInstrument>>> iterator = instruments.entrySet().iterator(); iterator
				.hasNext();) {
			Entry<String, TreeSet<MusicInstrument>> entry = iterator.next();
			String type = entry.getKey();
			for (Iterator iterator2 = instruments.get(type).iterator(); iterator2.hasNext();) {
				MusicInstrument object = (MusicInstrument) iterator2.next();
				list.add(object);
			}
		}
		Collections.sort(list, copmarator);

		for (MusicInstrument instr : list) {
			System.out.println(" " + instr);
		}
	}

	public void sellInstrument(MusicInstrument instr, int howMuch) {
		String theType = instr.getType();
		String s = instr.getClass().toString().substring(18);
		if (instruments.containsKey(theType)) {
			TreeSet<MusicInstrument> selected = instruments.get(theType);
			for (Iterator<MusicInstrument> iterator = selected.iterator(); iterator.hasNext();) {
				MusicInstrument musicInstrument = (MusicInstrument) iterator.next();
				if (musicInstrument.getName().equals(instr.getName())) {
					int numberInStack = musicInstrument.getNumber();
					if (numberInStack >= howMuch) {
						this.money += howMuch * musicInstrument.getPrice();
						musicInstrument.setNumber(numberInStack - howMuch);
						System.out.println("Sold for " + howMuch * musicInstrument.getPrice() + " left: "
								+ musicInstrument.getNumber());
					} else {
						System.out.println("Not enough " + s + "s in stack!");
					}
				}
			}
		} else {
			//System.out.println("This kind of instrument is not being sold here");
			askSaplier(instr, howMuch);
		}
	}

	private void askSaplier(MusicInstrument instr, int howMuch){
		Entry<MusicInstrument,Double> supplier = s.getInstrument(instr,howMuch);
		if(supplier!= null){
			double time =supplier.getValue();
			System.out.println("Time to we distributed : "+time);
		}
	}
	
	public void getNewInstruments(MusicInstrument instr, int howMuch) {
		String typeOfNew = instr.getType();
		instr.setNumber(howMuch);
		// ako ima takkav tip
		if (instruments.containsKey(typeOfNew)) {
			TreeSet<MusicInstrument> selected = instruments.get(typeOfNew);
			// ako ima to4no takav instrument
			for (Iterator<MusicInstrument> iterator = selected.iterator(); iterator.hasNext();) {
				MusicInstrument musicInstrument = (MusicInstrument) iterator.next();
				if (musicInstrument.getName().equals(instr.getName())) {
					musicInstrument.setNumber(musicInstrument.getNumber() + howMuch);
					break;
				}
			} // ako mu e razli4no imeto
			instruments.get(typeOfNew).add(instr);
		} else {
			// ako ni6ot nqma
			instruments.put(typeOfNew, new TreeSet());
			instruments.get(typeOfNew).add(instr);
		}
	}

	public void orderedAlphabetically() {
		System.out.println("====Alphabetically====");
		printInfo(new Comparator<MusicInstrument>() {
			@Override
			public int compare(MusicInstrument instr1, MusicInstrument instr2) {
				return (instr1.getName().compareTo(instr2.getName()));
			}
		});
	}

	public void orderedByPrice() {
		System.out.println("====By Price====");
		if (upOrDown().equalsIgnoreCase("up")) {
			printInfo(new Comparator<MusicInstrument>() {
				@Override
				public int compare(MusicInstrument o1, MusicInstrument o2) {
					return (int) (100 * (o1.getPrice() - o2.getPrice()));
				}
			});
		} else {
			printInfo(new Comparator<MusicInstrument>() {
				@Override
				public int compare(MusicInstrument o1, MusicInstrument o2) {
					return (int) (100 * (o2.getPrice() - o1.getPrice()));
				}
			});
		}
	}

	private String upOrDown() {
		String result = "";
		while (!(result.toLowerCase().equals("up") || result.toLowerCase().equals("down"))) {
			System.out.println("For vyzdodqshto(^) sortirane Enter \"Up\"");
			System.out.println("For nizhodqshto(v) sortirane Enter \"Down\"");
			Scanner sc = new Scanner(System.in);
			result = sc.next();
		}
		return result;
	}

	public void onlyInStack() {
		System.out.println("====In Stack====");
		for (Iterator<Entry<String, TreeSet<MusicInstrument>>> it = instruments.entrySet().iterator(); it.hasNext();) {
			Entry<String, TreeSet<MusicInstrument>> e = it.next();
			if (e.getValue().size()!=0) {
				System.out.println("------" + e.getKey() + "------");
			}
			for (Iterator<MusicInstrument> iterator = e.getValue().iterator(); iterator.hasNext();) {
				MusicInstrument currentInstrument = (MusicInstrument) iterator.next();
				System.out.println("    " + currentInstrument);

			}
		}
		
	}

}
