package homework1;

public class Computer {
	 int year;
	 double price;
	 boolean isNotebook;
	 double  hardDiskMemory;
	 double freeMemory;
	 String operationSystem;
	 
	 Computer(){
		 this.isNotebook = false;
		 this.operationSystem = "Win XP";
	 }
	 
	 Computer(int year,double price, double hardDiskMemory, double freeMemory){
		 this();
		 if (year >1900 && year <2018) {
			this.year = year;
		}
		 if (price >0) {
			this.price = price;
		}
		 if (hardDiskMemory >0) {
			this.hardDiskMemory =hardDiskMemory;
		}
		 if (this.hardDiskMemory>freeMemory) {
			this.freeMemory= freeMemory;
		}
	 }
	
	  public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		if (operationSystem != null && operationSystem.length()>0) {
			this.operationSystem = operationSystem;
		}
	}

	  int comparePrice(final Computer computer){
		  if (this.price >computer.price) {
			return -1;
		}else if(this.price <computer.price){
			return 1;
		}else{
			return 0;
		}
	  }
	  
	void changeOperationSystem( String operationSystem){
		 this.operationSystem = operationSystem;		 
	 }
	  
	   void useMemory(double memory){
		   if (freeMemory< memory) {
			System.out.println("Not enough free memory!");
		}else
			freeMemory -= memory;
	   }
}
