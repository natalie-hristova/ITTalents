package advanced_task;

 class Person {
	 private  String name;
	 private Person[] friends;
	 private Car car;
	 private int age;
	 private double weigth;
	 private char gender;
	 double money;
	 private String personalNumber;
	 private static final double PRICE_FOR_SCRAP= 1000;
	 
	Person(){
		this.age =0;
		this.weigth=4;
	}
	
	 Person(String name){
		 this();
		 if (name!= null && name .length()>0) {
			this.name=name;
		}else{
			this.name= "John";
		}
	 }
	 
	 Person(String name, String personalNumber, boolean isMale){
		 this(name);
		 this.friends = new Person[3];
		 if (personalNumber.length()==10 && areOnlyNumbersIn(personalNumber))  {
			this.personalNumber= personalNumber;
		}
		 if (isMale) {
			this.gender= 'm';
		}else{
			this.gender= 'f';
		}
	 }

	 void buyCar(Car car){
		 if (this.money >=car.getPrice()) {
			this.money-= car.getPrice();
			car.changeOwner(this);
			this.setCar(car);
		}
	 }

	 double sellCarForScrap(){
		 double scrapPrice= this.car.calculateCarPriceForScrap(PRICE_FOR_SCRAP);
		 this.car=null;
		 this.money += scrapPrice ;
	return scrapPrice;
	 }
	 
	private boolean areOnlyNumbersIn(String personalNumber){
		 char[] egn = personalNumber.toCharArray();
		 for (int i = 0; i < egn.length; i++) {
			if (egn[i]<'0'|| egn[i]>'9') {
				return false;
			}
		}
		 return true;
	 }
	 
	 void eat (){
			System.out.println("Eating ..");
		}
		void walk(){
			System.out.println("Walking...");
		}
		 void growUp(){
			 this.age++;
		 }
		 void drinkWater(double liters){
			 if (liters >0 && liters <2) {
				this.weigth+= liters;
			}
		 }
	 
	 @Override
		public String toString() {
		 if (this.car==null) {
			 return "Name: " + name + " NO car"+ " Age: " + age + " Money: "+ money;
		}
		 return "Name: " + name + " Car:"+ this.car+ " Age: " + age + " Money: "+ money;
		}

	public Person[] getFriends() {
		return friends;
	}

	public void addFriend(Person friend) {
		if (friend !=null) {
			for (int i = 0; i < friends.length; i++) {
				if (friends[i]== null) {
					this.friends[i] = friend;
				}
			}
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		 if (age >0 && age <130) {
				this.age = age;
			}
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		 if (weigth >4) {
				this.weigth= weigth;
			}
	}
	 
	 Car getCar() {
		return this.car;
	}

	void setCar(Car car) {
		if (car!=null) {
			this.car = car;
		}
	}

	String getName() {
		return name;
	}

	 void setMoney(double money) {
		this.money= money;
	}

}
