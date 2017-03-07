package agency;

import java.time.LocalDate;

import client.Buyer;
import property.Property;

public class View {
	/*
	 * ¬секи оглед има следните характеристики: Х имот;
	 *  Х агент; 
	 *  Х купувач; Х
	 * дата на провеждане на огледа
	 */
	private Property property;
	private Agent agent;
	private Buyer buyer;
	private LocalDate date;
	public View(Property property, Agent agent, Buyer buyer) {
		this.property = property;
		this.agent = agent;
		this.buyer = buyer;
	}
	
	public Property  getProperty(){
		return this.property;
	}

}
