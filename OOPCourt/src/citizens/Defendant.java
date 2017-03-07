package citizens;

import java.util.HashSet;

import people.Lawyer;

public class Defendant extends Citizen {

	private HashSet<Lawyer> laywers;

	public Defendant(String name, int age, String address, HashSet<Lawyer> laywers) {
		super(name, age, address);
		this.laywers= laywers;
	}

	public HashSet<Lawyer> getLawyers() {
		return laywers;
	}

}
