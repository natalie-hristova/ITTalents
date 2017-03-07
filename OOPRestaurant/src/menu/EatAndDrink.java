package menu;


public abstract class EatAndDrink  {
	protected String name;
	private double price;
	int number;

	public EatAndDrink(String name, double price) {

		this.name = name;
		this.price = price;
	}
		
	public double getPrice() {
		return this.price;
	}

	public int getNumber() {
		return this.number;
	}

	@Override
	public String toString() {
		return this.name + " - " + number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public String getName(){
		return this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EatAndDrink other = (EatAndDrink) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public void setNumber(int i) {
		if (i >= 0) {
			this.number = i;
		}

	}

	

}
