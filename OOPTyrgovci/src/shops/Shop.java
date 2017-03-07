package shops;

public abstract class Shop {

	private String address;
	private String workingTime;
	private double area;
	private double fee;

	public Shop() {
	}

	public Shop(String address, String workingTime, double area, double fee) {
		this.address = address;
		this.workingTime = workingTime;
		if (isValidArea(area)) {
			this.area = area;
		}
		this.fee = fee;
	}

	protected abstract boolean isValidArea(double area);

	public double getFee() {
		return this.fee;
	}

	public void setAddress(String address) {
		if (address != null && address.length() > 0) {
			this.address = address;
		}
	}

	@Override
	public String toString() {
		return "Shop: " + address ;
	}
	
}
