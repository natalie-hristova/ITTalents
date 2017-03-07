package menu;

public abstract class Drink extends EatAndDrink implements Comparable<Drink> {

	
	public Drink(String name, double price) {
		super(name, price);
	}
	@Override
	public int compareTo(Drink d) {
		return (this.name.compareTo(d.name));
	}
	
}
