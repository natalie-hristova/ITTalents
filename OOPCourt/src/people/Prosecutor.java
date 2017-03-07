package people;

public class Prosecutor  extends Jurist{

	public Prosecutor(String name, int intership, int cases) {
		super(name, intership, cases);
	}

	@Override
	protected boolean AreCasesValid(int cases) {
		return cases>=0;
	}

	@Override
	protected boolean isValidInternship(int internship) {
		return internship>=10;
	}

}