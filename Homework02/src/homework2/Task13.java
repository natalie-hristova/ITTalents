package homework2;

import java.util.Scanner;

public class Task13 {

	// Да се състави програма, която извежда всички
	// естествени трицифрени числа, които имат сбор на цифрите равен
	// на дадено число.
	// Дадено : sum, където 2>=sum<=27.
	// Пример: 26
	// Изход: 899, 989, 998.
	public static void main(String[] args) {
		System.out.println("Please , enter the sum (2>=sum<=27):");
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();

		for (int i = 100; i < 999; i++) {
			int unit = i % 10;
			int hundred = i / 100;
			int ten = i / 10 % 10;
			if ((unit + hundred + ten) == sum) {
				System.out.print(i + " ");
			}
		}
	}
}
