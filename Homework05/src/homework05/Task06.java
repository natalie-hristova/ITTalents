package homework05;

import java.util.Scanner;

public class Task06 {
	/*
	 * Напишете програма, която първо чете 2 масива и после извежда съобщение
	 * дали са еднакви, и дали са с еднакъв размер.
	 * 
	 */
	public static void main(String[] args) {
//		int[] firstArray = { 1, 2, 3, 4 };
//		int[] secondArray = { 1, 2, 3, 4 };
		System.out.println("Enter the length of the first array :");
		Scanner sc = new Scanner(System.in);
		int[] firstArray = new int [sc.nextInt()];
		
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Enter the element at position " + (i+1));
			firstArray[i]=sc.nextInt();
		}
		
		System.out.println("Enter the length of the second array :");
		int [] secondArray =new int [sc.nextInt()];
		
		
		for (int i = 0; i < secondArray.length; i++) {
			System.out.println("Enter the element at position " + (i+1));
			secondArray[i]=sc.nextInt();
		}
		
		boolean areTheSame = true;

		if (firstArray.length != secondArray.length) {
			System.out.println("The arrays have different sizes.");
		} else {
			System.out.print("The arrays have the same size");
			for (int i = 0; i < secondArray.length; i++) {
				if (firstArray[i] != secondArray[i]) {
					areTheSame = false;
					break;
				}
			}
			if (areTheSame) {
				System.out.println(" and are the same!");
			} else {
				System.out.println(" but are NOT the same!");
			}
		}
	}
}
