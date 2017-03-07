package client;

import agency.Agent;
import property.Property;

public class Seller extends Client{
	
	private Property property;
	private double money;

	public Seller(String name,Property property) {
		super(name);
		this.property= property;
		property.setSeller(this);
	}

	@Override
	public void register() {
		if (agency == null) {
			System.out.println("Set agency");
		}else{
		Agent agent =agency.getRandomAgent();
		agency.addProperty(property);
		agent.addSeller(this);
		}
	}

	public void getFromMoney(double minmoney) {
		this.money-=minmoney;
		
	}

	public void addMoney(double price) {
		this.money+=price;
		
	}


	

}
