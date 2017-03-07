package traders;

import Deliver.Deliver;
import Deliver.Drebno;

public class Ambulant extends Trader {

	private Drebno deliver;

	public Ambulant(double money) {
		super(money);
	}

	public Ambulant(String name, String address, double moneyAtFirst) {
		super(name, address, moneyAtFirst);
	}

	@Override
public	void makeOrder(double money, Deliver deliver) {
		if (deliver instanceof Drebno) {
			super.makeOrder(money, deliver);
		} else {
			System.out.println("This deliver is not OK");
		}
	}

}
