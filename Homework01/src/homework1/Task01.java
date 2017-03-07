package homework1;

import java.util.Scanner;

public class Task01 {
	// Да се изведат съобщения към потребителя и да се прочетат 2 числа от
	// клавиатурата A и B (може да са с плаваща запетая – double).
	// После да се прочете 3-то число C и да се провери дали то е м/у A и B.
	// Да се изведе подходящо съобщение за това дали C е между A и B.

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		System.out.println("Въведете A:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		System.out.println("Въведете B:");
		b = sc.nextDouble();
		System.out.println("Въведете C:");
		c = sc.nextDouble();
		if ((c < a && c > b) || (c > a && c < b)) {
			System.out.println("Числото " + c + " е между " + a + " и " + b);
		} else {
			System.out.println("Числото " + c + " не е между " + a + " и " + b);
		}
	}
}
