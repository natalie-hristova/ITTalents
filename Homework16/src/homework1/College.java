package homework1;

public class College {
	public static void main(String[] args) {
		Student st1 = new Student("Polly", "Economics", 22);
		Student st2 = new Student("Vergy", "Pharmacy", 21);
		Student st3 = new Student("Sissy", "Administration", 23);
		Student st4 = new Student("Deyan", "IT", 18);
		Student st5 = new Student("Blago", "IT", 19);
		Student st6 = new Student("Omo", "IT", 22);
		Student st7 = new Student("Desko", "IT", 25);
		Student st8 = new Student("Vesko", "IT", 27);
		Student st9 = new Student("Kris", "IT", 21);
		Student st10 = new Student("Natalie", "IT", 22);
		st1.receiveScholarship(4.5, 320);
		st1.printStudentInfo();
		st1.upYear();
		st1.setGrade(5.04);
		st1.receiveScholarship(4.95, 420);
		st1.printStudentInfo();
		StudentGroup stgr1 = new StudentGroup("IT");
		stgr1.addStudent(st7);
		stgr1.addStudent(st1);
		stgr1.addStudent(st2);
		stgr1.addStudent(st3);
		stgr1.addStudent(st4);
		stgr1.addStudent(st5);
		stgr1.addStudent(st10);
		stgr1.printStudentsInGroup();
		stgr1.emptyGroup();
		stgr1.printStudentsInGroup();
		stgr1.addStudent(st6);
		stgr1.addStudent(st8);
		stgr1.addStudent(st9);
		stgr1.printStudentsInGroup();
		st6.setGrade(5.6);
		st8.setGrade(3.5);
		st9.setGrade(4.9);
		System.out.println("The best student is " + stgr1.theBestStudent());
	}

}
