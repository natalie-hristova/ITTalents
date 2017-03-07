package menu;

public class Desert extends Food{

	public Desert(String name, int grams) {
		super(name, 4, grams);
	}

	@Override
	protected boolean areGramsValid(int grams) {
		return (grams>200 && grams<=300);
	}

	

	

	

}
