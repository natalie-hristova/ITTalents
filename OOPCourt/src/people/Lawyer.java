package people;

public class Lawyer extends Jurist{

	public Lawyer(String name, int intership, int cases) {
		super(name, intership, cases);
	}

	@Override
	protected boolean AreCasesValid(int cases) {
		return (cases>=10);
	}

	@Override
	protected boolean isValidInternship(int internship) {
		return internship>=0;
	}

}