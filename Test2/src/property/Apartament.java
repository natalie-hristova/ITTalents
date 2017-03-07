package property;

import java.util.Comparator;

import agency.Agent;

public class Apartament extends Property implements Comparable<Apartament> {
	
	private BuildType buildType;
	 public enum ApartamentType  implements IType{
		//студио, гарсониера, двустаен, тристаен, мезонет);
		STUDIO,GARSON,ONEBEDROOM,TWOBEDROOM,PENTHOUSE
	}

	public Apartament( String description, String address, double price, IType type, double area,
			BuildType buildType) {
		super(Property.Category.APARTAMENT, description, address, price, type, area);
		this.buildType= buildType;
	}

	@Override
	public int compareTo(Apartament ap1) {
		return (int)(100*(ap1.price-this.price));
	}

	
}
