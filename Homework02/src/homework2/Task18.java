package homework2;

import java.util.Scanner;

public class Task18 {

	// Да се състави програма, чрез която се въвежда две числа от
	// интервала [1..9].
	// Програмата да извежда таблицата за умножение.
	// Максималната стойност на множителите е определена от 2-те
	// числа.

	public static void main(String[] args) {
		System.out.println("Please, enter 2 numbers between [1,9]");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		if (firstNumber < 1 || firstNumber > 9 || secondNumber < 1 || secondNumber > 9) {
			System.out.println("Invalid data!");
		} else {

			for (int i = 1; i <= firstNumber; i++) {
				for (int j = 1; j <= secondNumber; j++) {
					System.out.println(i + " *" + j + " =" + (j * i));
				}
			}
		}
	}
}
