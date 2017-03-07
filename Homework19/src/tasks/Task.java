package tasks;

public abstract class Task {

	private String name;
	private int workingHours;
	
	Task( String name, int workingHours){
		if (name!= null && name.length()>0) {
			this.name = name;
		}
		if (workingHours>=0 && workingHours<=40) {
			this.workingHours= workingHours;		
		}
	}

	public String getName() {
		return this.name;
	}
	
	public int getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours>=0 && workingHours<=40) {
			this.workingHours= workingHours;		
		}
	}
	
}
