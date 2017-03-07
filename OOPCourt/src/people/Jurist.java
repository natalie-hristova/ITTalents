package people;

import citizens.Citizen;
import citizens.IPerson;

public abstract class Jurist implements IPerson{

	private String name;
	private int intership;
	private int cases;
	


	public Jurist(String name, int intership, int cases) {
		this.name = name;
		if (isValidInternship(intership)) {
			this.intership = intership;
		}
		if (AreCasesValid(cases)) {
			this.cases = cases;
		}
	}


	protected abstract boolean AreCasesValid(int intership) ;
	

	protected abstract boolean isValidInternship(int cases) ;

	public void askCitizen(IPerson person) {
		// TODO
	}

	public void takeNotes() {
		// TODO
	}

	public int getCases() {
		return cases;
	}

	public void setCases(int cases) {
		this.cases = cases;
	}
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.name + " - "+ this.cases;
	}
}
