package homework05;

import java.util.Scanner;

public class Task15 {
	/**
	 * Да се състави програма, която въвежда в едномерен масив реални числа.
	 * Като изход: програма извежда онези 3 различни числа, чиято абсолютна
	 * стойност формира максималната обща сума. Пример: 7.13; 0.2; 4.9; 5.1;
	 * 6.34; 1.12 Изход: 5.1; 6.34; 7.13
	 */
	public static void main(String[] args) {
		//double[] array = { -1, -2, -3, 3, 0, 1 };
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		double[] array = new double [sc.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter any number at position" + (i+1));
			array[i]= sc.nextDouble();
		}
		
		double max1 = array[0];
		double min1 = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max1 < array[i]) {
				max1 = array[i];
			}
			if (min1 > array[i]) {
				min1 = array[i];
			}
		}

		double max2 = min1;
		double max3 = min1;
		double min2 = max1;
		double min3 = max1;

		for (int i = 0; i < array.length; i++) {
			if (max2 < array[i] && array[i] < max1) {
				max2 = array[i];
			}
			if (min2 > array[i] && array[i] > min1) {
				min2 = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (max3 < array[i] && array[i] < max2) {
				max3 = array[i];
			}
			if (min3 > array[i] && array[i] > min2) {
				min3 = array[i];
			}
		}

		double minSum = -(min1 + min2 + min3);
		double maxSum = max1 + max2 + max3;

		if (maxSum > minSum) {
			System.out.println(max3 + " " + max2 + " " + max1);
		} else {
			System.out.println(min1 + " " + min2 + " " + min3);
		}
	}

}
