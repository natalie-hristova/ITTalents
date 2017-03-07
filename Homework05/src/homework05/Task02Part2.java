package homework05;

import java.util.Scanner;

public class Task02Part2 {
	/*
	 * Нека по въведен масив да се конструира нов, като половината му елементи
	 * са точно като на оригиналния, а другите да са тези елементи, но в обратен
	 * ред. Последно, да се изведе новия масив на екрана.
	 * 
	 */
	public static void main(String[] args) {

	//int[] givenArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		int[] givenArray = new int [sc.nextInt()];
		for (int i = 0; i < givenArray.length; i++) {
			System.out.println("Enter the element at position " + (i+1));
			givenArray[i]=sc.nextInt();
		}
		int[] newArray = new int[givenArray.length*2];
	
		for (int i = 0; i < givenArray.length; i++) {
			newArray[i] = givenArray[i];
			newArray[newArray.length -1-i] = givenArray[i];
		}


		System.out.print("[");
		for (int i = 0; i < newArray.length; i++) {
			if (i == newArray.length - 1) {
				System.out.print(newArray[i]);
			} else {
				System.out.print(newArray[i] + ", ");
			}
		}
		System.out.print("]");

	}

}
