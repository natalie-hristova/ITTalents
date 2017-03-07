package homework05;

import java.util.Scanner;

public class Task04 {
	/*
	 * Да се прочете масив и да се отпечата дали е огледален. Следните масиви са
	 * огледални: [3 7 7 3] [4] [1 55 1] [6 27 -1 5 7 7 5 -1 27 6]
	 */
	public static void main(String[] args) {
		System.out.println("Enter the length of the array");
		Scanner sc = new Scanner(System.in);
		// int size = sc.nextInt();
		int[] array = new int[sc.nextInt()];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element at " + (i + 1) + " position.");
			array[i] = sc.nextInt();
		}

		boolean isMirror = true;
		for (int i = 0; i < array.length; i++) {
			if (array[array.length - 1 - i] != array[i]) {
				isMirror = false;
				break;
			}
		}
		System.out.println("The statement that this array is mirror is: " + isMirror);
	}
}
