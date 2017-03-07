package people;

import java.util.Random;

public class Judge extends Jurist{

	public Judge(String name,int intership, int cases) {
		super(name, intership, cases);
	}

	@Override
	protected boolean AreCasesValid(int cases) {
		return (cases>=0);
	}

	public int takeDecision(boolean juryMenDecision ){
		if (juryMenDecision) {
			Random r = new Random ();
			return r.nextInt(38)+3;
		}
		return 0;
	}
	
	@Override
	protected boolean isValidInternship(int internship) {
		return (internship>=5);
	}

}
