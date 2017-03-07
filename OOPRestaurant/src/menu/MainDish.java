package menu;

public  class MainDish extends Food implements IMutra {

	public MainDish(String name, int grams) {
		super(name, 9, grams);
	}

	@Override
	protected boolean areGramsValid(int grams) {
		return (grams>=400 && grams<=800);
	}

}
