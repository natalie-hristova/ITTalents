package citizens;
import java.util.HashSet;

import people.Lawyer;

public class Accuser extends Citizen{

	

	private HashSet<Lawyer> laywers;
	public Accuser(String name, int age, String address) {
		super(name, age, address);
	}
	
	
	public void setLaywer(HashSet<Lawyer> laywers) {
	if (laywers!= null) {
		this.laywers = laywers;
	}
	}
}
