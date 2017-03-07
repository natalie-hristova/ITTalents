package exercise7;

import java.util.Scanner;

public class Task11 {
	/**
	 * Да се напише програма която изисква от потребителя да въведе 2 числа n и
	 * m. След това да се построи матрица с размер n x m по следният начин
	 * (примерите са дадени за въведени n=4 и m=5):
	 * 1,2,3,4,5
	 * 6,7,8,9,10,
	 * 11,12,13,14,15,
	 * 16,17,18,19,20
	 */
	public static void main(String[] args) {
//		System.out.println("Enter the number of rows and columns : ");
//		Scanner sc= new Scanner (System.in);
//		int n =sc.nextInt();
//		int m =sc.nextInt();

		int n=4;
		int m=5;
		int[][] array = new int [n][m];
		int number =0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				number ++;
				array[i][j] = number;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
