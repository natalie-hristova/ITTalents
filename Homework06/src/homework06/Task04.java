package homework06;

import java.util.Scanner;

public class Task04 {
	
	/*
	 * Имате предварително въведени стойности на елементи в двумерен
	масив - естествени числа.
	Да се състави програма, чрез която се извеждат стойностите на
	елементите в двумерен масив след обръщането му на +90 градуса.
	Пример:
	1,2,3,4
	5,6,7,8
	9,10,11,12
	13,14,15,16
	Изход
	13,9,5,1
	14,10,6,2
	15,11,7,3
	16,12,8,4

	 */
	public static void main(String[] args) {
//		int [][] array = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12},
//				{13,14,15,16}
//		};
		
		System.out.println("Enter the number of rows and columns :");
		Scanner sc= new Scanner(System.in);
		int [][] array = new int [sc.nextInt()][sc.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter the elemtn at row "+(i+1) + " and row "+(j+1));
				array[i][j]= sc.nextInt();
			}
		}
		
	int [][] rotatedArray = new int [array[0].length][array.length];
	
	//filling the new array with the old values by 90 degrees.
	for (int i = 0; i < rotatedArray.length; i++) {
		for (int j = 0; j < rotatedArray[i].length; j++) {
			rotatedArray[i][j]= array[rotatedArray[i].length-1-j][i];
			if (j== rotatedArray[i].length-1) {
				System.out.print(rotatedArray[i][j]);
			}else{
				System.out.print(rotatedArray[i][j] + ",");
			}	
		}
		System.out.println();
	}
	}

}
