package court;

import java.util.HashSet;
import java.util.Iterator;

import cases.Case;
import people.Jurist;

public class Court {

	private String name;
	private HashSet<Jurist> jurists;
	private HashSet<Case> cases;

	public Court(String name) {
		this.name = name;
		this.jurists = new HashSet();
		this.cases = new HashSet<>();
	}

	public void addJurist(Jurist jurist){
		this.jurists.add(jurist);
	}

	public void addCase(Case c){
		this.cases.add(c);
	}
	
	public void printInfo(){
		for (Iterator iterator = jurists.iterator(); iterator.hasNext();) {
			Jurist jurist = (Jurist) iterator.next();
			System.out.println(jurist);
		}
	}
}
