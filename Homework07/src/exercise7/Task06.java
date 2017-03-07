package exercise7;

public class Task06 {
	/*
	 * Ќапишете програма, ко€то за дадена матрица от символи
отпечатва на екрана елементите, които се намират на главни€
диагонал.
	 */

	public static void main(String[] args) {
		int [][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][i]+" ");
		}
	}
}
