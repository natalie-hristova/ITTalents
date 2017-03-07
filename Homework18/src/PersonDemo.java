
public class PersonDemo {
	public static void main(String[] args) {
		Person [] people = new Person[10];
		Person p1 = new Person("Georgi",21,true);
		Person p2 = new Person("Mia",19,false);
		Employee p3 = new Employee("Maya",21,false,35);
		Employee p4 = new Employee("Ivan",15,true,20);
		Student p5 = new Student("Eva",23,false,4.5);
		Student p6 = new Student("Stoyan",21,true,3.5);
		people[0]=p1;
		people[1]=p2;
		people[2]=p3;
		people[3]=p4;
		people[4]=p5;
		people[5]=p6;
		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Employee) {
				((Employee) people[i]).showEmployeeInfo();
			}else if (people[i] instanceof Student) {
				((Student) people[i]).showStudentInfo();
			}else if (people[i] instanceof Person){
				people[i].showPersonInfo();
				System.out.println();
			}
		}
		
		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Employee) {
				if (!people[i].isMale) {
					System.out.println("The money she has to get is "+((Employee) people[i]).calculateOvertime(2));
				}else{
				System.out.println("The money he has to get is "+((Employee) people[i]).calculateOvertime(2));
				}
			}
		}
	}

}
