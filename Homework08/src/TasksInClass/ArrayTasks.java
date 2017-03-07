package TasksInClass;

import java.util.Random;
import java.util.Scanner;

public class ArrayTasks {

	/*
	 * Write a function to print an array 
	 * Write a function to generate random
	 * array of size n Write a function to multiply two arrays A and B
	 */
	public static void main(String[] args) {

		int n = getPositive();
		int[] array = generateArray(n);
		printArray(array);
		int[] array1 = { 4, 5, 6, 7 };
		int[] array2 = { 1, 2, 3, 4 };
		System.out.print("The new multiplied array: ");
		int[] array3 = arrayMultiplier(array1, array2);
		printArray(array3);
	}

	static int getPositive() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please, enter a positive number :");
			n = sc.nextInt();
		} while (n <= 0);
		return n;
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static int[] generateArray(int n) {
		int[] array = new int[n];
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);
		}
		return array;
	}

	static int[] arrayMultiplier(int[] array1, int[] array2) {
		int[] array = new int[array1.length];
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				array[i] = array1[i] * array2[i];
			}
		} else {
			System.out.println("The arrays have dofferent sizes.");
		}
		return array;
	}

}
