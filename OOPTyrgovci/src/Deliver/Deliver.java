package Deliver;

public abstract class Deliver {

	private String name;
	private String address;
	private String workingTime;

	public Deliver() {
	}

	public void setName(String name ){
		if (name != null && name .length()>0) {
			this.name = name;
		}
	}
	public Deliver(String name, String address, String workingTime) {
		this.name = name;
		this.address = address;
		this.workingTime = workingTime;
	}

	public abstract double getDiscount();

	@Override
	public String toString() {
		return "Deliver :" + name ;
	}
	

}
