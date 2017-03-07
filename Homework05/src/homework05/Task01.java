package homework05;

import java.util.Scanner;

public class Task01 {
	/**
	 * ƒа се прочете масив и да се намери най-малкото число кратно на 3 от
	 * масива. 10, 3, 5, 8, 6, -3, 7 Ќай-малкото число кратно на 3 е -3
	 */
	public static void main(String[] args) {
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		boolean hasThreeDevider = false;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element with index " + (i + 1));
			array[i] = sc.nextInt();
			if (array[i] % 3 == 0) {
				hasThreeDevider = true;
			}
		}

		if (hasThreeDevider) {
			int minIndex;
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 3 == 0) {
					minIndex = i;
					for (int j = minIndex; j < array.length; j++) {
						if (array[j] % 3 == 0 && array[j] < array[minIndex]) {
							minIndex = j;
						}
					}
					System.out.println("Minimal number devided by 3 is : " + array[minIndex]);
					break;
				}
			}
		} else {
			System.out.println("There is not number that can be devided by 3.");
		}
	}
}
