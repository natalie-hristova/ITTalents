package property;

import agency.Agent;
import client.Seller;

public abstract class Property {
	/*
	 * Апартаментите и къщите разполагат с информация за вид строителство: ЕПК, Тухла, Панел
или Кирпич.
	 */
	public enum Category {
		APARTAMENT,HOUSE,PLOT
	}
	
	public  enum BuildType{
		EPK,TUHLA,PANEL,KERPICH
	}
	private Category category;
	private String description;
	private String address;
	protected double price;
	private IType type;
	private double area;
	private Agent agent;
	private Seller seller;
	public Property(Category category, String description, String address, double price, IType type, double area) {
		
		this.category = category;
		this.description = description;
		this.address = address;
		this.price = price;
		this.type = type;
		this.area = area;
	}
	public double getPrice() {
		return this.price;
	}
	public Seller getSeller() {
		return this.seller;
		
	}
	public void setSeller(Seller seller) {
		this.seller= seller;
		
	}
	
	public void setPrice(double price){
		if (price>0) {
			this.price= price;
		}
	}
	public Category getCategory() {
		
		return this.category;
	}
	
	@Override
	public String toString() {
		return this.category + " - " +price;
	}

}
