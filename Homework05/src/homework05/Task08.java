package homework05;

import java.util.Scanner;

public class Task08 {
	/*
	 * Напишете програма, която намира и извежда най-дългата редица от еднакви
	 * поредни елементи в даден масив.
	 */
	public static void main(String[] args) {

		//int[] array = { 1, 1, 1, 1, 12, 2, 3, 4, 5, 6, 6, 6 };
		System.out.println("Enter the length of the array :");
		Scanner sc= new Scanner(System.in);
		int [] array = new int [sc.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please, enter the element at position " + (i+1));
			array[i]= sc.nextInt();
		}
		int counter = 1;
		int max = 0;
		int wantedNumber = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				counter++;
				if (max < counter) {
					wantedNumber = array[i];
					max = counter;
				}
			} else {
				counter = 1;
			}
		}

		if (max == 0) {
			System.out.println("No repeatable numbers.");
		} else {
			System.out.print("The longest repeatble queue is : ");
			for (int i = 0; i < max; i++) {
				System.out.print(wantedNumber + " ");
			}
		}
	}
}
