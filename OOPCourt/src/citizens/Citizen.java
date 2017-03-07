package citizens;


public class Citizen implements IPerson {
	private String name;
	private int age;
	private String address;

	public Citizen(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	

}
