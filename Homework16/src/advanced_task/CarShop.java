package advanced_task;

 class CarShop {

	 private Car[] cars;
	 
	CarShop(int capacity) {
		if (capacity > 0) {
			this.cars= new Car[capacity];
		}
	}
	
	boolean addCar(Car car) {
		if (car == null) {
			return false;
		} else {
			for (int i = 0; i < cars.length ; i++) {
				if (this.cars[i] == null) {
					this.cars[i] = car;
					return true;
				}
			}
			System.out.println("No free place for this car!");
		}
		return false;
	}
	
	 Car getNextCar(){
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				return cars[i];
			}
		}
		System.out.println("There is not next car!");
	 return null;
	 }
	 
	 void sellNextCar(Person buyer){
		for (int i = 0; i < cars.length; i++) {
			if (cars[i]!= null) {
					buyer.setCar(cars[i]);
					cars[i].changeOwner(buyer);
					System.out.println("The sale of " +cars[i].getModel() + " was made!");
					removeCar(cars[i]);
					break;
			}
		}
		if (buyer.getCar()== null) {
			System.out.println("No sale was made!");
		}
	 }
	 
	 	boolean removeCar(Car car){
		 for (int i = 0; i < cars.length; i++) {
			if (this.cars[i] != null &&this.cars[i].equals(car)) {
				cars[i]= null;
				return true;
			}
		}
		 return false;
	 }
	 	
	 void showAllCarsInTheShop(){
		for (int i = 0; i < cars.length; i++) {
			if (cars[i]!= null) {
				System.out.println(cars[i].toString());
			}
		}
	 }

}
