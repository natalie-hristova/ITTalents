package Deliver;

public class Edro extends Deliver {

	private static final double EDRO_DISCOUNT = 15;
	private static int number = 1 ;
	
	
	public Edro(){
		this.setName("Edro "+ Integer.valueOf(number));
		number++;
	}

	public Edro(String name, String address, String workingTime) {
		super(name, address, workingTime);
	}

	@Override
	public double getDiscount() {
		return EDRO_DISCOUNT;
	}

}
