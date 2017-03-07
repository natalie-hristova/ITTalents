package exercise7;

public class Task10 {
	/*
	 *  Напишете програма, която намира най-често срещания елемент
в масив. Пример: {4, 1, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3} => 4 (5 times).
	 */

	public static void main(String[] args) {
		int [] array = {4, 1, 1,4, 2, 3,4,4, 1, 2,4, 9,3};
		
		int times=0;
		int maxTimes = 0;
		int mostOftenNumber = array[0];
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					times ++;
				}
			}
			if (maxTimes<times) {
				maxTimes = times;
				mostOftenNumber =array[i];
			}
			times = 0;
		}
		System.out.println("=> "+ mostOftenNumber +  " ("+  maxTimes+ " times)");
	}
}
