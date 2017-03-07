package homework05;

import java.util.Scanner;

public class Task18 {
	/*
	 * Дадени са два едномерни масива с естествени числа. Да се състави
	 * програма, която сравнява всички числа с еднакви индекси от двата масива и
	 * записва в трети масив, по-голямото от двете числа. Да се изведе
	 * съдържанието и на трите масива Пример: 18,19,32,1,3, 4, 5, 6, 7, 8 
	 * 1,2,3,4,5,16,17,18,27,11 Изход: 18,19,32 ,4,5,16,17,18,27,11
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		//int[] firstArray = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		//int[] secondArray = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		System.out.println("Enter the size of the first array :");
		Scanner sc= new Scanner(System.in);
		int[] firstArray =new int [sc.nextInt()];
		
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Enter element at " + (i+1));
			firstArray[i] =sc.nextInt();
		}
		
		System.out.println("Enter the size of the second array :");
		int[] secondArray = new int [sc.nextInt()];
		
		for (int i = 0; i < secondArray.length; i++) {
			System.out.println("Enter element at " + (i+1));
			secondArray[i] =sc.nextInt();
		}

		if (firstArray.length != secondArray.length) {
			System.out.println("The sizes of arrays are different!");
		} else {
			int[] thirdArray = new int[firstArray.length];
			for (int i = 0; i < thirdArray.length; i++) {
				if (firstArray[i] > secondArray[i]) {
					thirdArray[i] = firstArray[i];
				} else {
					thirdArray[i] = secondArray[i];
				}
			}

			// printing the first array
			System.out.print("The first array : [");
			for (int i = 0; i < firstArray.length; i++) {
				if (i == firstArray.length - 1) {
					System.out.print(firstArray[i]);
				} else {
					System.out.print(firstArray[i] + ", ");
				}
			}
			System.out.println("]");

			// printing the second array
			System.out.print("The second array : [");
			for (int i = 0; i < secondArray.length; i++) {
				if (i == secondArray.length - 1) {
					System.out.print(secondArray[i]);
				} else {
					System.out.print(secondArray[i] + ", ");
				}
			}
			System.out.println("]");

			// printing the new array
			System.out.print("The NEW array : [");
			for (int i = 0; i < thirdArray.length; i++) {
				if (i == thirdArray.length - 1) {
					System.out.print(thirdArray[i]);
				} else {
					System.out.print(thirdArray[i] + ", ");
				}
			}
			System.out.println("]");
			
		}
	}
}
