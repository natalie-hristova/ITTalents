package homework05;

import java.util.Scanner;

public class Task10 {
	/*
	 * Да се състави програма, чрез която се въвеждат 7 цели числа в едномерен
	 * масив. Програмата да изведе числото, което е най-близко до средната
	 * стойност на въведените числа. Пример: 1,2,3,4,5,6,7 Изход: средна
	 * стойност 4, най-близка стойност 4
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter values for the array with 7 elements.");
		int[] array = new int[7];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element at position " + (i + 1));
			array[i] = sc.nextInt();
			sum += array[i];
		}

		double average = (double) sum / 7;
		int closestValue = array[0];

		for (int i = 0; i < array.length; i++) {
			if ((array[i] > closestValue && array[i] <= average) || (array[i] < closestValue && array[i] >= average))
				closestValue = array[i];
		}

		System.out.println("The closest value is : " + closestValue + ". The average is : " + average);
	}
}
