package property;

import agency.Agent;

public class Plot extends Property implements Comparable<Plot>{
	
	private boolean isInRegulation;
	 public enum TypePlot implements IType {
		FILED,MEADOW,FOREST
	}
	
	public Plot( String description, String address, double price, IType type, double area) {
		super(Property.Category.PLOT, description, address, price, type, area);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Plot p1) {
		return (int)(100*(p1.price-this.price));
	}
}
