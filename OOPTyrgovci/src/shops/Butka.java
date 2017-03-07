package shops;

public class Butka extends Shop implements ETable,IChain{
	
	private static final double BUTKA_FEE = 50;
	private static int number = 1;

	public Butka() {
		this.setAddress("Butka " + Integer.valueOf(number));
		number++;
	}

	public Butka(String address, String workingTime, double area) {
		super(address, workingTime, area, BUTKA_FEE);
	}

	@Override
	protected boolean isValidArea(double area) {
		return (area >=4 && area <=6);
	}

}
