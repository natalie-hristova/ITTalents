package traders;

import java.util.ArrayList;
import java.util.Random;

import Deliver.Deliver;
import shops.Product;
import shops.Shop;

public abstract class Trader {

	private String name;
	private String address;
	private double moneyAtFirst;
	private ArrayList<Product> products;
	private static final double OVERCHARGING = 1.3;// + 30%
	
	public Trader(double money){
		if (money >=0) {
			this.moneyAtFirst = money;
		}
		this.products= new ArrayList();
	}

	public Trader(String name, String address, double moneyAtFirst) {
		this.name = name;
		this.address = address;
		this.moneyAtFirst = moneyAtFirst;
		this.products= new ArrayList();
	}

	public void makeOrder(double money, Deliver deliver) {
		if (money > (moneyAtFirst / 2)) {
			System.out.println("Not enough money!");
		} else {
			products.addAll(getProductForThisMoney(money));
			moneyAtFirst -= moneyForProducts(products) * (1 - deliver.getDiscount());
		}
	}

	private ArrayList<Product> getProductForThisMoney(double money) {
		ArrayList<Product> products = new ArrayList();
		Random r = new Random();
		for (int i = 0; i < money / 5; i++) {
			if (money > 0) {
				
				double levs = r.nextInt(10) + 5;
				products.add(new Product("", levs));
				money -= levs;
			}
		}
		return products;
	}

	public ArrayList<Product> sellProducts(ArrayList<Product> products) {
		Random r = new Random();
		ArrayList<Product> soldProducts = new ArrayList<>();
		int numberOfSold = r.nextInt(products.size() - 1);
		for (int i = 0; i < numberOfSold; i++) {
			int index = r.nextInt(products.size() - 1);
			if (index < (products.size())) {
				soldProducts.add(products.get(index));
			}
		}
		return soldProducts;
	}

	private double moneyForProducts(ArrayList<Product> products) {
		double sum = 0;
		for (int i = 0; i < products.size(); i++) {
			sum += products.get(i).getPrice();
		}
		return sum;
	}

	void collectMoney(Shop shop) {
		ArrayList<Product> soldProducts = sellProducts(products);
		products.removeAll(soldProducts);
		this.moneyAtFirst += OVERCHARGING * moneyForProducts(soldProducts);

	}

	@Override
	public String toString() {
		return "Trader: " + name ;
	}

	void payFee(Shop shop) {
		this.moneyAtFirst -= shop.getFee();
	}
	//public abstract void addShop(Shop shop);

	public ArrayList<Product> getProducts() {
		return products;
	}

	public double  getMoney() {
	
		return moneyAtFirst;
	}
}
