
public class Student extends Person {

	private double score;
	
	public Student(String name, int age, boolean isMale,double score) {
		super(name, age, isMale);
		if (score >=2 && score <=6) {
			this.score = score;
		}
	}

	@Override
	public String toString() {
		return "Student: "+super.toString()+ "Score:" + this.score;
	}
	
	void showStudentInfo() {
		System.out.println(this.toString());
		
	}
	
}
