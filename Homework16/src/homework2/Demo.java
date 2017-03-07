package homework2;

public class Demo {
	public static void main(String[] args) {
		Employee employee = new Employee("Georgi");
		Task task = new Task("Put naylon", 2);
		employee.setHoursLeft(8);
		employee.setCurrentTask(task);
		employee.showReport();
		Task task2 = new Task("Paint",5);
		employee.setCurrentTask(task2);
		employee.showReport();
		Task task3 = new Task("Lying on sofa",-3); 
		employee.setCurrentTask(task3);
		employee.showReport();
		Task task4 = new Task("Clean",1); 
		employee.setCurrentTask(task4);
		employee.showReport();
		
	}

}
