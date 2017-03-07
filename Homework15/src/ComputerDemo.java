
public class ComputerDemo {
	/*
	Да се зададат стойности на всеки от компютрите за year, price,
	hardDiskMemory, freeMemory, operationSystem.Нека единият компютър
	да е лаптоп. На единия от двата компютъра да се задели памет 100
	(чрез метода useMemory), а на другия, да се смени операционната
	система (чрез метода changeOperationSystem), след което да се
	изведат на екрана всичките полета на двата компютъра.
	 */

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new  Computer();
		comp1.year =2015;
		comp2.year=2010;
		comp1.price = 1999.99;
		comp2.price=1200.15;
		comp1.hardDiskMemory=2048;
		comp2.hardDiskMemory=1024;
		comp1.freeMemory= 2000;
		comp2.freeMemory=994;
		comp1.operationSystem="Windows";
		comp2.operationSystem = "Linux";
		comp1.isNotebook= true;
		comp2.useMemory(100);
		comp1.changeOperationSystem("MAC");
		
		if (comp1.isNotebook) {
			System.out.println("The first computer is laptop.");
		}else{
		System.out.println("The first computer is a PC. ");
		}
		System.out.println("It is from " + comp1.year+ " year.\nIts price is "+ comp1.price + " .\nIt has hard disc memory "+
		comp1.hardDiskMemory+" and free memory " + comp1.freeMemory+ " .\nIts operation system is "+ comp1.operationSystem);
	
		if (comp2.isNotebook) {
			System.out.println("The second computer is laptop.");
		}else{
		System.out.println("The second computer is a PC. ");
		}
		System.out.println("It is from " + comp2.year+ " year.\nIts price is "+ comp2.price + " .\nIt has hard disc memory "+
		comp2.hardDiskMemory+" and free memory " + comp2.freeMemory+ " .\nIts operation system is "+ comp2.operationSystem);
	
	}
}
