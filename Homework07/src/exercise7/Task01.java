package exercise7;

public class Task01 {
	
	/*
	 * Напишете програма, която проверява дали в масив от цели
числа всички числа са неотрицателни.

	 */
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		boolean hasNegative = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]<0) {
				hasNegative = true;
				break;
			}
		}
		System.out.println(hasNegative);
	}

}
