package tasks;

public class Demo {
	public static void main(String[] args) {
		Employee employee = new Employee("");
		Employee employee2 = new Employee("");
		Task task = new BuilingTask("Put naylon", 2);
		Task task2 = new DecorationTask("Paint", 5);
		Task task3 = new AdministrativeTask("Lying on sofa", 4);
		Task task4 = new DecorationTask("Clean", 5);
		Task task5 = new DecorationTask("do sth", 3);
		Task task6 = new BuilingTask("Ruin", 6);
		Task task7 = new DecorationTask("Decorate", 5);
		Task task8 = new AdministrativeTask("Present", 4);
		Task task9 = new BuilingTask("Build a wall", 16);
		Task task10 = new DecorationTask("Inflate baloons", 3);
		AllWork allWork = new AllWork();
		allWork.addTask(task);
		allWork.addTask(task2);
		allWork.addTask(task3);
		allWork.addTask(task4);
		allWork.addTask(task5);
		allWork.addTask(task6);
		allWork.addTask(task7);
		allWork.addTask(task8);
		allWork.addTask(task9);
		allWork.addTask(task10);
		Employee.setAllWork(allWork);
	
		int i =1;
		while(true) {
			System.out.println("DAY: "+ i + " ----------------------------------");
			employee.startWorkingDay();
			employee.work();
			System.out.println("---------------------------1");
			employee2.startWorkingDay();
			employee2.work();
			System.out.println("---------------------------2");
			i++;
			if(allWork.isAllWorkDone()){
				break;
			}
		}

		// employee.setHoursLeft(8);
		// employee.setCurrentTask(task);
		// employee.showReport();
		// employee.setCurrentTask(task2);
		// employee.showReport();
		// employee.setCurrentTask(task3);
		// employee.showReport();
		// employee.setCurrentTask(task4);
		// employee.showReport();

	}

}
