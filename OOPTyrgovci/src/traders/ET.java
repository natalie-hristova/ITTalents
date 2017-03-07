package traders;

import Deliver.Deliver;
import Deliver.Drebno;
import shops.ETable;
import shops.Shop;

public class ET extends Trader {

	private ETable shop;
	private Drebno[] delivers;

	public ET(double money){
		super(money);
	}
	
	public ET(String name, String address, double moneyAtFirst) {
		super(name, address, moneyAtFirst);
		this.delivers = new Drebno[5];
	}

	public Drebno[] getDelivers() {
		return delivers;
	}

	public void setDelivers(Drebno[] delivers) {
		if (delivers != null) {
			this.delivers = delivers;
		}
	}

	@Override
	public void makeOrder(double money, Deliver deliver) {
		if (deliver instanceof Drebno) {
			super.makeOrder(money, deliver);
		} else {
			System.out.println("Deliver is not OK");
		}
	}

	public ETable getShop() {
		return shop;
	}

	// is it better here to put (Shop shop) or ETable shop or should I put it in the demo ?????????????????
	public void addShop(Shop shop) {
		if (shop != null && shop instanceof ETable) {
			this.shop = (ETable)shop;
		}
	}



}
