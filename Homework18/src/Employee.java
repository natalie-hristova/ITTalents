
public class Employee extends Person{
	
	private double daySalary;
	private double workingHours=8;

	public Employee(String name, int age, boolean isMale,double daySalary) {
		super(name, age, isMale);
		if (daySalary >=0) {
			this.daySalary= daySalary;
		}
	}

	double calculateOvertime(double hours) {
		if (this.age <18 || hours <0) {
			return 0;
		}
		return (daySalary/workingHours)* hours*1.5;
	}

	 void showEmployeeInfo(){
		 System.out.print("Emoployee: ");
		 super.showPersonInfo();
		 System.out.println("DaySalary: " + daySalary);
	 }
}
