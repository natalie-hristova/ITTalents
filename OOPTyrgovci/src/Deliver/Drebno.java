package Deliver;

public class Drebno extends Deliver {
	private static int number = 1;
	
	public Drebno(){
		this.setName("Drebno "+ Integer.valueOf(number));
		number++;
	}


	public Drebno(String name, String address, String workingTime) {
		super(name, address, workingTime);
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
