package homework05;

import java.util.Scanner;

public class Task14 {
	/**
	 * Имате предварително въведен едномерен масив, съдържащ реални числа. Да се
	 * състави програма, чрез която се избират само елементи от масива със
	 * стойности от интервала [-2.99..2.99] и се отпечатват в нов масив. Новият
	 * масив да се извежда на екрана. Пример:
	 * 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2 Изход: 0.2; 0.99; 1.4; 1.2
	 * 
	 */
	public static void main(String[] args) {

		//double[] array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		System.out.println("Plese, enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		double[] array = new double [sc.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter whatever number you want for the element at position " + (i+1));
			array[i]=sc.nextDouble();
		}
		
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > -2.99 && array[i] < 2.99) {
				count++;
			}
		}

		int index = 0;
		double[] newArray = new double[count];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > -2.99 && array[i] < 2.99) {
				newArray[index] = array[i];
				index++;
			}
		}
		
		System.out.println("The elements in the interval (-2.99,2.99) are:");
		for (int i = 0; i < newArray.length; i++) {
			if (i == newArray.length - 1) {
				System.out.print(newArray[i]);
			} else {
				System.out.print(newArray[i] + "; ");
			}
		}
	}

}
