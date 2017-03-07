package homework2;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;

	Employee(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
	}

	void work() {
		if (this.currentTask.getWorkingHours() > this.hoursLeft) {
			this.currentTask.setWorkingHours(currentTask.getWorkingHours() - this.hoursLeft);
			this.hoursLeft = 0;
		} else if (currentTask.getWorkingHours() < this.hoursLeft) {
			this.hoursLeft -= currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
		} else {
			this.currentTask.setWorkingHours(0);
			this.hoursLeft = 0;
		}
	}

	void showReport() {
		this.work();
		System.out.print("Worker's Name: " + this.name);
		System.out.print(". Taks' name: " + this.currentTask.getName());
		System.out.print(". Working hours left to the worker: " + this.hoursLeft);
		System.out.println(". Working hours left on task: " + this.currentTask.getWorkingHours());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
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
		if (hoursLeft > 0) {
			this.hoursLeft = hoursLeft;
		}
	}

}
