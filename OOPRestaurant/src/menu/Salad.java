package menu;

public  class Salad extends Food implements IVegan{

	public Salad(String name, int grams) {
		super(name, 5, grams);
	}

	@Override
	protected boolean areGramsValid(int grams) {
		return (grams>=300 && grams<=600);
	}

}
