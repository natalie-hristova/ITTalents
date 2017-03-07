package shops;

public class Product implements Comparable<Product>{
	private String name;
	private double price;
	private static int number = 0;

	public Product(String name, double price) {
		if (name != null && name.length()>0) {
			this.name = name;
		}else{
			this.name = "Product " + Integer.valueOf(number);
			number ++;
		}
		if (price>=5 && price <=15) {
			this.price = price;
		}
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Product pr) {
		return (int)(100*(this.price- pr.price));
	}

	
}
