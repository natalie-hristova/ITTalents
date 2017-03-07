package homework06;

import java.util.Scanner;

public class Task05 {
	/*
	 * Да се състави програма, при която предварително са въведени
	естествени числа в двумерен масив 4*4 елемента.
	Програмата да извежда резултат от проверката какво е съотношението
	на най-голямата сума по редове спрямо най-голямата сума по колони.
	Пример:
	1,2,3,4
	5,6,7,8
	9,10,11,12
	13,14,15,16

	Изход:
	най-голяма сума по редове 58
	най-голяма сума по колони 40
	Максималната сума по редове е > от максималната сума по колони
	 */
	public static void main(String[] args) {
//		int [][] array = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12},
//				{13,14,15,16},
//		};
		System.out.println("Матрицата е 4х4.");
		Scanner sc = new  Scanner (System.in);
		
		int [][] array =new int [4][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Въведете елемент на ред "+ (i+1)+" и колона "+ (j+1));
				array[i][j]=sc.nextInt();
			}
		}
		
		int sumOfCols=0;
		int sumOfRows=0;
		int maxSumOfCols=0;
		int maxSumOfRows=0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumOfCols+=array[i][j];
				sumOfRows += array[j][i];
			}
				if (maxSumOfCols<sumOfCols) {
				maxSumOfCols= sumOfCols;
				}
				sumOfCols=0;
				
				if (maxSumOfRows<sumOfRows) {
					maxSumOfRows=sumOfRows;
				}
				sumOfRows=0;
		}
		
		System.out.println("най-голяма сума по редове "+maxSumOfRows);
		System.out.println("най-голяма сума по колони "+maxSumOfCols);
		System.out.print("Максималната сума по редове е ");
		if (maxSumOfCols > maxSumOfRows) {
			System.out.print("> от");
		}else if(maxSumOfCols < maxSumOfRows){
			System.out.print("< от");
		}else{
			System.out.print("= на");
		}
		System.out.println(" максималната сума по колони");
		
	}

}
