package shops;

public class Sergia extends Shop implements ETable {

	private static final double SERGIA_FEE = 50;
	private static int number = 1;

	public Sergia() {
		this.setAddress("Sergia " + Integer.valueOf(number));
		number++;
	}

	public Sergia(String address, String workingTime, double plosht) {
		super(address, workingTime, plosht, SERGIA_FEE);
	}

	@Override
	protected boolean isValidArea(double area) {
		return (area > 2 && area < 10);
	}
}
