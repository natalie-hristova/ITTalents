package homework2;

import java.util.Scanner;

public class Task06 {

	// Да се прочете число от екрана(конзолата) и да се
	// изведе сбора на всички числа между 1 и въведеното число.

	public static void main(String[] args) {
		System.out.println("Please, enter your number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("The result is : " + sum);
	}
}
