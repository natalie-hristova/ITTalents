package homework1;

public class Student {
	private String name ;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	Student(){
		this.grade =4.0;
		this.yearInCollege =1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		if (name != null && name.length()>0) {
			this.name = name;
		}
		if (subject != null && subject.length()>0) {

			this.subject = subject;
		}
		if (age>17) {
			this.age = age;
		}
	}
	
	void upYear(){
		if (!this.isDegree) {
			this.yearInCollege++;
		}else{
			System.out.println("The student has graduaded!");
		}
		if (this.yearInCollege==4) {
			this.isDegree = true;
		}
	}

	double receiveScholarship(double min,double amount){
		if (this.grade>=min && this.age<30) {
			this.money+= amount;
		}
		return this.money;
	}
	
	void printStudentInfo(){
		System.out.println("Name: " + this.name + ", Age: " + this.age+ ", Year: "+ this.yearInCollege + " Money: " +this.money + " Grade: "+ this.grade);
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getGrade() {
		return this.grade;
	}

	public String getName() {
		return this.name;
	}

	public Object getSubject() {
		return this.subject;
	}
}
