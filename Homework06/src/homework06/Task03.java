package homework06;

import java.util.Scanner;

public class Task03 {
	/*
	 * Имате двумерен масив от числа, чийто стойности са въведени
	предварително. Да се отпечатат сумата на елементите на масива,
	както и средноаритметичното на тези числа.
	 */
	public static void main(String[] args) {
		
//		int[][] array ={
//				{1,2,3},
//				{4,5,12}
//		};
		System.out.println("Enter the number of columns and rows :");
		Scanner sc = new Scanner(System.in);
		int [][] array = new int [sc.nextInt()][sc.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter the element at row " + (i+1)+ "and column "+ (j+1));
				array[i][j]=sc.nextInt();
			}
		}
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
			sum +=array[i][j];
			}
		}
		System.out.println("The sum is " + (int)sum);
		System.out.println("The average is " +  (sum/(array.length* (array[0].length))));
	}
}
