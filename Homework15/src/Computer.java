
public class Computer {
	 int year;
	 double price;
	 boolean isNotebook;
	 int hardDiskMemory;
	 int freeMemory;
	 String operationSystem;
	
	  void changeOperationSystem( String newOperationSystem){
		 operationSystem = newOperationSystem;		 
	 }
	  
	   void useMemory( int memory){
		   if (freeMemory< memory) {
			System.out.println("Not enough free memory!");
		}else
			freeMemory -= memory;
	   }
}
