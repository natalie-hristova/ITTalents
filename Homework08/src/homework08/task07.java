package homework08;

import java.util.Scanner;

public class task07 {
	/*
	 * Да се състави програма, която чете набор от думи разделени с интервал.
	 * Като резултат да се извеждат броя на въведените думи, както и броя знаци
	 * в най-дългата дума.
	 *  Пример: asd fg hjkl 
	 *  Изход: 3 думи, най-дългата е с 4 символа
	 */

	public static void main(String[] args) {
		wordCouterSizeAndNumber();
		
	}
	
	static void wordCouterSizeAndNumber(){
		Scanner sc= new Scanner(System.in);
		int counter = 1;
		int longestWord =0;
		int max = 0;
		System.out.println("Please enter text :");
		String text = sc.nextLine();
		String[] array = text.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >max) {
				max = array[i].length();
			}
		}
		System.out.println(array.length + " words, the longest is with " + max + " symbols");
	}
}
