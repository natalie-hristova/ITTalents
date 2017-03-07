package homework08;

import java.util.Scanner;

public class Task12 {
	/*
	 * Да се създаде метод, който приема за входни данни число N и връща масив
	 * от числа с дължина N, който съдържа всички числа от 1 до N.
	 */

	public static void main(String[] args) {
		int n = getNumber();
		printArray(getArray(n));
	}
	static int getNumber(){
		int n=-1;
		do{
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		}while(n<1);
		return n;
	}
	static  int[] getArray(int n){
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
		}
		return array;
	}
	
	static void printArray(int [] array){
		System.out.print("[");
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i]+ ", ");
		}
		System.out.println(array[array.length-1]+ "]");
	}
}
