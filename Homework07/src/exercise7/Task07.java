package exercise7;

public class Task07 {
	/*
	 * Напишете програма, която за дадена матрица намира
произведението на елементите под главния диагонал.
	 */

	public static void main(String[] args) {
		int [][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		
		long proizv =1;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i>j) {
					System.out.println(array[i][j]);
					proizv *= array[i][j];
				}
			}
		}
		System.out.println(proizv);
	}
}
