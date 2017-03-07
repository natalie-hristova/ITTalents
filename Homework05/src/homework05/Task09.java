package homework05;

import java.util.Scanner;

public class Task09 {

	/**
	 * Напишете програма, в която потребителя въвежда масив, след което
	 * елементите на масива се обръщат в обратен ред (Целта не е масива да се
	 * отпечата в обратен ред, ами първо да се обърне, след което да се отпечата
	 * в нормален ред). Пробвайте да решите задачата първо с един допълнителен
	 * масив и после без да използвате друг масив.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[sc.nextInt()];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the number at possition " + (i + 1));
			array[i] = sc.nextInt();
		}

		int[] newArray = new int[array.length];

		for (int i = array.length - 1; i >= 0; i--) {
			newArray[array.length - 1 - i] = array[i];
		}

		System.out.print("The new array : [");
		for (int i = 0; i < newArray.length; i++) {
			if (i == newArray.length - 1) {
				System.out.print(newArray[i]);
			} else {
				System.out.print(newArray[i] + ", ");
			}
		}
		System.out.println("]");
	}
}
