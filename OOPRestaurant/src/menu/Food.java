package menu;

public abstract class Food  extends EatAndDrink  implements Comparable<Food>{

	
	private int grams;
	public Food(String name, double price, int grams) {
		super(name, price);
		if (areGramsValid(grams)) {
			this.grams = grams;
		}
	}
	
	protected  abstract boolean areGramsValid(int grams);

	@Override
	public int compareTo(Food f) {
		return (this.name.compareTo(f.name));
	}
	
	
	
	
}
