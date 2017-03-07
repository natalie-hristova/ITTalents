package homework08;

import java.util.Scanner;

public class Task13 {
	/*
	 * Да се създаде метод, който приема два масива от числа и връща масив,
	 * съдържащ всички елементи на подадените масиви, като в първата част на
	 * масива са елементите на първия подаден масив, а във втората част – тези
	 * на втория подаден масив.
	 */

	public static void main(String[] args) {

		int [] array1 = getArray();
		int [] array2 = getArray();
		printArray(getNewArray(array1, array2));
	}
	
	static int getLengthOfTheArray(){
		int n=-1;
		do{
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		 }while(n<1);
		return n;
	}

	static int[] getArray(){
	int n =getLengthOfTheArray();
		int[] array = new int[n];
		Scanner sc= new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element at position " +(i+1));
			array[i]=sc.nextInt();
		}
		return array;
	}

	 static int[] getNewArray(int[] array1, int[] array2){
		 int size = array1.length+ array2.length;
		 int[] newArray= new int [size];
		 int counter = 0;
		 for (int i = 0; i < array1.length; i++) {
			newArray[i]=array1[i];
		}
		 for (int i = array1.length; i < newArray.length; i++) {
			newArray[i]=array2[counter];
			counter++;
		}
		 return newArray;
	 }

	 static void printArray(int[] array){
		 System.out.print("{ ");
		 for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i]+ ", ");
		}
		 System.out.println(array[array.length-1]+ " }");
	 } 
}
