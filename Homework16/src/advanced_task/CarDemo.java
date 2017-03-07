package advanced_task;

public class CarDemo {
	public static void main(String[] args) {
		Person poli = new Person("Polina");
		Person petyr = new Person("Petyr", "6785896468", true);
		CarShop shop =new  CarShop(5);
		Car c1 = new Car("Toyota","White",false);
		Car c2 = new Car("bibit", "Red",true);
		Car c4 = new Car("VW", "Yellow",true);
		Car c3 = new Car(null,false);
		
		c1.setPrice(12000);
		c2.setPrice(2000);
		System.out.println("c1 is more expensive than c2: " + c1.isMoreExpensiveThan(c2));
		System.out.println("The price for c1 as srab is: "+ c1.calculateCarPriceForScrap(1000));
	
	poli.setMoney(120000.30);
	poli.buyCar(c2);
	System.out.println(poli.toString());
	poli.sellCarForScrap();
	System.out.println(poli.toString());
		
		shop.addCar(c1);
		shop.addCar(c2);
		shop.addCar(c3);
		shop.addCar(c4);
		shop.showAllCarsInTheShop();
		shop.sellNextCar(poli);
		System.out.println(poli.toString());
		shop.showAllCarsInTheShop();
	
	}

}
