package homework05;

import java.util.Scanner;

public class Task13 {
	/*
	 * Да се състави програма, чрез която се въвежда число и се представя като
	 * число в двоична бройна система. Програмата, чрез масив, да изчислява
	 * последователно всички цифри на въведеното естествено число в 2-ична
	 * бройна система. Пример: 99 Изход: 1100011
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		int counterNumber = number;
		while (counterNumber > 0) {
			counterNumber /= 2;
			count++;
		}

		byte[] array = new byte[count];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = (byte) ((byte) number % 2);
			number /= 2;

		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		sc.close();
	}

}
