package menu;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Menu {
	private  HashSet<Food> food= new HashSet<>();
	private  HashSet<Drink> drinks= new HashSet<>();
	
	public Menu(){
	
		food.add(new Desert("Cake", 300));
		food.add(new Desert("Ecler", 300));
		food.add(new Salad("Russian", 300));
		food.add(new Salad("Grren Salad", 300));
		food.add(new MainDish("Musaka", 500));
		food.add(new MainDish("Potatoes with chicken meat", 600));
		drinks.add(new Alcohol("Whickey"));
		drinks.add(new Alcohol("Tequila"));
		drinks.add(new NotAlcohol("Coke"));
		drinks.add(new NotAlcohol("Orange juice"));
	}

	public Set<Food> getFood() {
		return Collections.unmodifiableSet(food);
	}

	public Set<Drink> getDrinks() {
		return Collections.unmodifiableSet(drinks);
	}


}
