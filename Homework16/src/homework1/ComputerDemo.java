package homework1;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		Computer c2 = new Computer(2000, 750.55, 1024, 845);
		Computer c3 = new Computer(2015, 999.99, true, 2048, 2000, "Linux");
		Computer c4 = new Computer(2013, 999.99, false, 2000, 1900, "Mac");
		int price = c4.comparePrice(c2);
		System.out.print("For the comparison of c4 and c2 =>");
		relevantPrinter(price);
		price = c4.comparePrice(c3);
		System.out.print("For the comparison of c4 and c3 =>");
		relevantPrinter(price);
		price = c2.comparePrice(c3);
		System.out.print("For the comparison of c2 and c3 =>");
		relevantPrinter(price);
		
	}

	static void relevantPrinter(int price) {
		if (price == 1) {
			System.out.println("The first given computer is more expensive");
		} else if (price == -1) {
			System.out.println("The second one is more expensice");
		} else {
			System.out.println("The prices are equal");
		}
	}

}
