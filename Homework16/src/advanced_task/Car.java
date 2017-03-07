package advanced_task;

class Car {

	private final String model;
	private static int number = 1;
	private int maxSpeed;
	private int currentSpeed;
	private String color;
	private int currentGear;
	private Person owner;
	private double price;
	private boolean isSportCar;

	Car(String model, boolean isSportCar) {
		if (model != null && model.length() > 0) {
			this.model = model;
		} else {
			this.model = "car " + String.valueOf(number);
			number++;
		}
		this.isSportCar = isSportCar;
		this.currentGear = 50;
		this.currentGear = 1;
	}

	Car(String model, String color, boolean isSportCar) {
		this(model, isSportCar);
		if (color != null && color.length() > 0) {
			this.color = color;
		}
	}

	boolean isMoreExpensiveThan(Car car) {
		return (this.price > car.price);
	}

	double calculateCarPriceForScrap(double metalPrice) {
		return metalPrice * calculateCoeficient();
	}

	private double calculateCoeficient() {
		double coeficient = 0.2;
		if (this.color.equalsIgnoreCase("white") || this.color.equalsIgnoreCase("black")) {
			coeficient += 0.05;
		}
		if (isSportCar) {
			coeficient += 0.05;
		}

		return coeficient;
	}

	int getMaxSpeed() {
		return maxSpeed;
	}

	void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 0 && maxSpeed < 1000) {
			this.maxSpeed = maxSpeed;
		}
	}

	int getCurrentSpeed() {
		return currentSpeed;
	}

	void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed >= 0 && currentSpeed < this.maxSpeed) {
			this.currentSpeed = currentSpeed;
		}
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		if (color != null && color.length() > 0) {
			this.color = color;
		}
	}

	int getCurrentGear() {
		return currentGear;
	}

	void setCurrentGear(int currentGear) {
		if (currentGear > 0 && currentGear < 7) {
			this.currentGear = currentGear;
		}
	}

	Person getOwner() {
		return owner;
	}

	void changeOwner(Person owner) {
		if (owner != null) {
			this.owner = owner;
		}
	}

	@Override
	public String toString() {
		if (this.owner != null) {
			return "Car [model=" + model + ", maxSpeed=" + maxSpeed + ", currentSpeed=" + currentSpeed + ", color="
					+ color + ", currentGear=" + currentGear + ", owner=" + owner.getName() + "]";
		} else {
			return "Car [model=" + model + ", maxSpeed=" + maxSpeed + ", currentSpeed=" + currentSpeed + ", color="
					+ color + ", currentGear=" + currentGear + ", NO owner";
		}

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (currentGear != other.currentGear)
			return false;
		if (currentSpeed != other.currentSpeed)
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		if (!model.equals(other.model))
			return false;

		return true;
	}

	String getModel() {
		return this.model;
	}

	void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	double getPrice() {
		return price;
	}

}
