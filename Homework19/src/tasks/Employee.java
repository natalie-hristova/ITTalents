package tasks;

public class Employee {

	private final String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;
	private static int  number=1;

	Employee(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}else{
			this.name = "Employee "+ String.valueOf(number);
			number++;
		}
	}
	
	void work() {
		while (this.getHoursLeft() > 0) {
			if (allWork.isAllWorkDone()) {
				break;
			}
			if ((this.currentTask == null || currentTask.getWorkingHours() <= 0)) {
				Task a = allWork.getNextTask();
				if (a != null) {
					this.setCurrentTask(a);
				} else {
					System.out.println("No free task!");
					break;
				}
			}
			if (this.currentTask.getWorkingHours() > this.getHoursLeft()) {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.getHoursLeft());
				this.setHoursLeft(0);
			} else {
				this.hoursLeft -= currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
			}
			System.out.println(currentTask.getName() + " being done by " + this.name);
		}
	}

	void showReport() {
		this.startWorkingDay();
		this.work();
		System.out.print("Worker's Name: " + this.name);
		System.out.print(". Taks' name: " + this.currentTask.getName());
		System.out.print(". Working hours left to the worker: " + this.hoursLeft);
		System.out.println(". Working hours left on task: " + this.currentTask.getWorkingHours());
	}

	void startWorkingDay() {
		this.hoursLeft = 8;
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	static AllWork getAllWork() {
		return allWork;
	}

	static void setAllWork(AllWork newAllWork) {
		if (newAllWork != null) {
			allWork = newAllWork;
		}
	}
}
