package traders;

import Deliver.Deliver;
import shops.IChain;
import shops.Shop;

public class TradingChain extends Trader {

	private Deliver[] deliveries;// max 15
	private IChain[] shops; // max10

	public TradingChain(double money) {
		super(money);
		this.shops = new IChain[10];
		this.deliveries = new Deliver[15];
	}

	public TradingChain(String name, String address, double moneyAtFirst) {
		super(name, address, moneyAtFirst);
		this.deliveries = new Deliver[15];
		this.shops = new IChain[10];
	}

	public IChain[] getShops() {
		return shops;
	}

	public void addShop(Shop shop) {
		if (shop!= null && shop instanceof IChain && freePlacesForShop()>0) {
			for (int i = 0; i < shops.length; i++) {
				if (shops[i]== null) {
					this.shops[i]= (IChain)shop;
					break;
				}
			}
		}
	}

	public int freePlacesForShop(){
		int counter =0;
		for (int i = 0; i < shops.length; i++) {
			if (shops[i]== null) {
				counter++;
			}
		}
		return counter;
	}
	
	@Override
	public void makeOrder(double money, Deliver deliver) {
		super.makeOrder(money, deliver);

	}

	@Override
	void collectMoney(Shop shop) {
		for (int i = 0; i < shops.length; i++) {
			super.collectMoney((Shop)shops[i]);
		}
	}

}
