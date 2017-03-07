package property;

import agency.Agent;

public class House extends Property implements Comparable<House> {

	 public enum TypeHouse implements IType {
		FLOOR, WHOLE
	}

	private int numberToPark;
	private double yardArea;
	private BuildType buildType;

	public House(String description, String address, double price, IType type, double area,
			BuildType buildType) {
		super(Property.Category.HOUSE, description, address, price, type, area);
		this.buildType = buildType;
	}

	@Override
	public int compareTo(House h1) {
		return (int) (100 * (h1.price - this.price));
	}
}
