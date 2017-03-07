package saplier;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import instruments.Daire;
import instruments.Guitar;
import instruments.Kaval;
import instruments.MusicInstrument;
import instruments.Sintezator;
import instruments.Tupan;

public class Saplier {

	HashMap<MusicInstrument,Double> instruments;
	
	public Saplier(){
		instruments = new HashMap();
		instruments.put(new Guitar(300,5,"Red Guitar"),12.5);
		instruments.put(new Sintezator(1300,5,"Red Sintezator"),34.4);
		instruments.put(new Kaval(300,5,"Red Kaval"),45.15);
		instruments.put(new Tupan(300,5,"Red Tupan"),23.2);
		instruments.put(new Daire(300,5,"Red Daire"),3.05);
		instruments.put(new Daire(300,5,"The daire"),3.05);
	}
   public Entry<MusicInstrument,Double> getInstrument(MusicInstrument instr, int howMuch){
		for (Iterator<Entry<MusicInstrument,Double>> iterator = instruments.entrySet().iterator(); iterator.hasNext();) {
			Entry<MusicInstrument,Double> type = (Entry<MusicInstrument,Double>) iterator.next();
			if (type.getKey().getName().equals(instr.getName()) && type.getKey().getNumber()>=howMuch) {
				System.out.println("Done ");
				type.getKey().setNumber(type.getKey().getNumber()-howMuch);
				return type;
			}
	}
	   System.out.println("We don't have");
	  return null; 
   }	
	
}
