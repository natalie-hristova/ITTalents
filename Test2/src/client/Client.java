package client;

import agency.Agency;
import agency.Agent;
import property.Property;

public abstract class Client {
	

	protected String name;
	private String phoneNumber;
	protected Agency agency;
	protected Agent agent;
	public Client(String name) {
		if (name!=null &&name.length()>0) {
			this.name = name;
		}
	}

	public void setAgency(Agency agency){
		this.agency= agency;
	}
	public abstract  void register();
}
