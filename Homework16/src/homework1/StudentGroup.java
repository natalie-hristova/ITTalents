package homework1;

public class StudentGroup {

	private static String groupSubject;
	private Student [] students;
	private int freePlaces;
	
	StudentGroup(){
		this.students = new Student[5];
		this.freePlaces=5;
	}
	
	StudentGroup(String groupSubject){
		this();
		if (groupSubject!= null && groupSubject.length()>0) {
			StudentGroup.groupSubject=groupSubject;
		}
	}
	
	void addStudent(final Student s){
		if (s.getSubject().equals(StudentGroup.groupSubject) && this.freePlaces>0 && !containsStudent(s)) {
			this.students[students.length -freePlaces]=s;
			this.freePlaces-=1;
		}
		
	}
	
	private boolean containsStudent(Student student){
		for (int i = 0; i < students.length; i++) {
			if (students[i]==(student)) {
				return true;
			}
		}
		return false;
	}
	
	void emptyGroup(){
		this.students= new Student[5];
		this.freePlaces=5;
	}
	
	String theBestStudent(){
		double max=0;
		int index=-1;
		for (int i = 0; i < students.length-freePlaces; i++) {
			if (max<this.students[i].getGrade()) {
				max = this.students[i].getGrade();
				index = i;
			}
		}
		return this.students[index].getName();
	}
	
	void printStudentsInGroup(){
		System.out.println("The students from "+ groupSubject + ":");
		if (freePlaces==5) {
			System.out.println("No students in this group!");
		}else{
		for (int i = 0; i < students.length-this.freePlaces; i++) {
			students[i].printStudentInfo();
		}
	}
	}
}
