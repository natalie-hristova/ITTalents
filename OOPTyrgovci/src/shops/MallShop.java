package shops;

public class MallShop extends Shop implements IChain {

	private static final double MALLSHOP_FEE = 50;
	private static int number = 1;

	public MallShop() {
		this.setAddress("MallShop " + Integer.valueOf(number));
		number++;
	}

	public MallShop(String address, String workingTime, double area, double fee) {
		super(address, workingTime, area, MALLSHOP_FEE);
	}

	@Override
	protected boolean isValidArea(double area) {
		return (area >= 10 && area <= 100);
	}

}
