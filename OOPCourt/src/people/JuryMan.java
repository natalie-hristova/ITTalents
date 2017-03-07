package people;

import java.util.Random;

public class JuryMan  extends Jurist{

	public JuryMan(String name,int intership, int cases) {
		super(name, intership, cases);
	}

	@Override
	protected boolean AreCasesValid(int cases) {
		return true;
	}

	public boolean takeDecisionIsGuily(){
	Random r = new Random();
	int x = r.nextInt(2);
	return (x==1);
	}
	
	@Override
	protected boolean isValidInternship(int internship) {
		return true;
	}

}