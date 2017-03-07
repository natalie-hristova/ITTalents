package homework1;

import java.util.Scanner;

public class Task06 {

	// Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
	// им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
	// а3 да има старата стойност на а1.

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers - a1, a2 and a3 : ");
		Scanner sc = new Scanner(System.in);
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double a3 = sc.nextDouble();
		double temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		System.out.println("New a1 = " + a1 + ", a2 = " + a2 + ", a3 = " + a3);
	}
}
