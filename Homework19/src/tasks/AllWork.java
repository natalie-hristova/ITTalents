package tasks;

public class AllWork {
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask=0;// index in tasks
	
	AllWork(){
		this.tasks = new Task[10];
		freePlacesForTasks=10;
	}
	
	void addTask(Task task){
		if (task!= null) {
			tasks[tasks.length - freePlacesForTasks] = task;
			freePlacesForTasks--;
		}
	}
	
	Task getNextTask(){
		if (currentUnassignedTask== -1) {
			return null;
		}
		for (int i = currentUnassignedTask; i < tasks.length-1; i++) {
			if (tasks[i] != null) {
				Task task =tasks[i];
			//	tasks[i]= null;
				currentUnassignedTask++;
				return task;
			}
		}
		if (tasks[tasks.length-1] != null) {
			Task task =tasks[tasks.length-1];
			tasks[tasks.length-1]= null;
			currentUnassignedTask =-1;
			return task;
		}
		return null;
	}

	boolean isAllWorkDone(){
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i]!= null &&tasks[i].getWorkingHours()!=0) {
				return false;
			}
		}
		System.out.println("All work is done!");
		return true;
	}
}
