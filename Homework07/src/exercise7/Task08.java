package exercise7;

public class Task08 {
	/*
	 * Напишете програма, която за матрица от булеви стойности,
проверява дали се съдържа елемент със стойност true над
втория диагонал.
	 */

	public static void main(String[] args) {
	boolean[][] array = {
			{false,true,true},
			{false,true,true},
			{true,false,false}
	};
	
	boolean hasTrue = false;
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if ((i+j<array.length-1) && array[i][j]) {
				System.out.println(array[i][j]);
				hasTrue=true;
				break;
			}
		}
	}
	System.out.println("The array has TRUE above the secondary diagonal :"+hasTrue);
	}
}
