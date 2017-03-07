package homework2;

import java.util.Scanner;

public class Task14 {

	// Да се състави програма, която по въведено
	// естествено число N от интервала [10..200] извежда в обратен
	// ред всички числа, които са кратни на 7 и са по-малки от N.

	public static void main(String[] args) {
		System.out.println("Please, enter number between [10,200] :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number >= 10 && number <= 200) {
			for (int i = number - 1; i > 0; i--) {
				if (i % 7 == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("Invalid data!");
		}
	}
}
