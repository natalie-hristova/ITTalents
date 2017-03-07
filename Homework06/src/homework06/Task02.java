package homework06;

import java.util.Scanner;

public class Task02 {
	/*
	 * Имате квадратен двумерен масив от естествени числа, чийто стойности
 		се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
 		Пример:
 		1,4,6,3
 		5,9,7,2
 		4,8,1,9
 		2,3,4,5
 		Изход:
 		1 9 1 5
 		3 7 8 2

	 */
	public static void main(String[] args) {
//		int [][] array = {
//				{1,4,6,3},
//				{5,9,7,2},
//				{4,8,1,9},
//				{2,3,4,5},
//		};
		
		System.out.println("Please enter the side of the square matrix :");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt(); 
		int [][] array = new int [size][size];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Please enter the element at row " + (i+1) + " and column " + (j+1));
				array[i][j]=sc.nextInt();
			}
		}
		
		int [] mainDiagonal=new int [array.length];
		int indexOfMainDiagonal=0;
		int [] secondaryDiagonal = new int [array.length];
		int indexOfSecondaryDiagonal = 0;
		
		for (int i = 0; i < secondaryDiagonal.length; i++) {
			for (int j = 0; j < secondaryDiagonal.length; j++) {
				if (i==j) {
					mainDiagonal[indexOfMainDiagonal]=array[i][j]; 
							indexOfMainDiagonal++;
				}
				if (i+j== array.length-1) {
					secondaryDiagonal[indexOfSecondaryDiagonal]= array [i][j];
					indexOfSecondaryDiagonal++;
				}
			}
		}
		
		System.out.println("The numbers at the main diagonal are :");
		for (int i = 0; i < mainDiagonal.length; i++) {
			System.out.print( mainDiagonal[i] + " ");
		}
		System.out.println();
		
		System.out.println("The numbers at the secondary diagonal are :");
		for (int i = 0; i < secondaryDiagonal.length; i++) {
			System.out.print(secondaryDiagonal[i] + " ");
		}
	}

}
