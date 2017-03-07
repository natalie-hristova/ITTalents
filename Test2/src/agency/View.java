package agency;

import java.time.LocalDate;

import client.Buyer;
import property.Property;

public class View {
	/*
	 * ����� ����� ��� �������� ��������������: � ����;
	 *  � �����; 
	 *  � �������; �
	 * ���� �� ���������� �� ������
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
