package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import agency.Agency;
import agency.Agent;
import agency.ComparatorAgentsByMoney;
import agency.View;
import client.Buyer;
import client.Seller;
import property.Apartament;
import property.House;
import property.IType;
import property.Plot;
import property.Property;
import property.Property.BuildType;

public class Demo {
	public static void main(String[] args) {
		Random r = new Random();
		// 1. �� �� ������� ������� �������� ������� � ��� ������ � ����������
		// �����.

		String[] names = { "Pesho", "Misho", "Sasho", "Gosho", "Ivan", "Strahil" };
		TreeSet<Agent> agents = new TreeSet();
		while (agents.size() <= 5) {
			if (agents.size() == 5) {
				break;
			}

			int index = r.nextInt(names.length);
			agents.add(new Agent(names[index]));

		}
		Agency agency = new Agency("������� �������", agents);
		ArrayList<Seller> sellers = new ArrayList();

		/**
		 * �� �� �������� 30 ��������� �� �����. �� ����� �������� �� �� �������
		 * ���� �� ���������� ������� � 33% ���� �� � ����������, 33% ���� �� �
		 * ���� � 33% ���� �� ������. ���������� �������������� ���� �� �� ��
		 * ���������� �������. ������ �� ������� �� ������� � �� ������ ����� 50
		 * 000 � 80 000 ����, �� ������������� � ����� 70 000 � 150 000 ����; ��
		 * ��������� � ����� 30 000 � 85 000 ����.
		 * 
		 */
		for (int i = 0; i < 30; i++) {
			int p = r.nextInt(3);
			switch (p) {
			case 0: {
				int index = r.nextInt(names.length);
				int price = r.nextInt(80_000) + 70_000;
				sellers.add(new Seller(names[index],
						new Apartament("", "", price, Apartament.ApartamentType.GARSON, 23, BuildType.EPK)));

				break;
			}
			case 2: {
				int index = r.nextInt(names.length);
				int price = r.nextInt(30_000) + 50_000;
				sellers.add(new Seller(names[index],
						new House("", "", price, House.TypeHouse.FLOOR, 23, BuildType.KERPICH)));

				break;
			}
			case 1: {
				int index = r.nextInt(names.length);
				int price = r.nextInt(50_000) + 30_000;
				sellers.add(new Seller(names[index], new Plot("", "", price, Plot.TypePlot.FILED, 23)));
				break;
			}

			default:
				break;
			}
		}
		// 3. ������ ��������� �� ����������� ������� �� �� �������� �
		// ���������;
		for (Seller seller : sellers) {
			seller.setAgency(agency);
			seller.register();
		}

		// 4. �� �� �������� 10 �������� �� ���������� ������� � ������� �����
		// 30 000 � 150 000 ����;
		ArrayList<Buyer> buyers = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			int index = r.nextInt(names.length);
			int money = r.nextInt(120_000) + 30_000;

			buyers.add(new Buyer(names[index], money));
		}
		// 5. ������ �������� �� ����������� ������ �� ������� �� ���� ���
		// ���������;

		for (Buyer buyer : buyers) {
			buyer.setAgency(agency);
			buyer.register();
		}

		// 6. ����� ������� �� ����� 3 ������ �� ���������� ����� �� ���������;
		for (Buyer buyer : buyers) {
			for (int j = 0; j < 3; j++) {
				Property p = agency.getProperty();
				buyer.declareView(p);
			}
		}

		// 7. ����� ������� �� ������ ������� �� ����� �� ���������� �� ����
		// ����� �� ���������� �������;
		for (Buyer buyer : buyers) {
			if (buyer.getPropertyToBuy() != null) {
				buyer.declareBuy(buyer.getPropertyToBuy());
			}
		}

		//8. �� �� ������ �� ������ �������� ������ �� ��������� ���� ����������
		// �� �������;
		agency.printMoney();
		
		//9.�� �� ������ �� ������ �������� ������ �� ����� ����� �� ��������� ���� ����������
		//�� �������, ���� �������� �� ��������� �� ���-������� ��� ���� � ���-����� �������
		
		agency.printAgentsByMoney();
	}

}
