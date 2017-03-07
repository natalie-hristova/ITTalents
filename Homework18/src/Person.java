
public class Person {

	protected String name;
	protected int age;
	protected boolean isMale;

	public Person(String name, int age, boolean isMale) {
		if (name != null && name.length()>0) {
			this.name = name;
		}
		if (age>0 && age <130) {
			this.age = age;
		}
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return "Name:" + name + " Age:" + age + " is a man: " + isMale+" " ;
	}

	void showPersonInfo(){
		System.out.print(this.toString());
	}
	
}
