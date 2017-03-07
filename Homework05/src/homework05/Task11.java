package homework05;

import java.util.Scanner;

public class Task11 {
	/*
	 * Да се състави програма, която въвежда от клавиатурата 7 цели числа в
	 * едномерен масив Програмата да изведе всички числа кратни на 5, но по
	 * големи от 5. Пример: -23, -55, 17, 75, 56, 105, 134 Изход: 75,105 - 2
	 * числа
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Enter 7 numbers:");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element at position " + (i + 1));
			array[i] = sc.nextInt();

		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + " ");
				counter++;
			}
		}
		System.out.println("- " + counter + " numbers");
	}
}
