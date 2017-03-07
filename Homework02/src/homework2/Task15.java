package homework2;

import java.util.Scanner;

public class Task15 {

	// Да се състави програма, която да изчисли сумата на
	// всички числа от 1 до въведено число N.
	// Пример: 5
	// Изход: 15
	// Използвайте цикъл do-while.
	public static void main(String[] args) {
		System.out.println("Please enter N : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 1;
		int sum = 0;
		do {
			sum += temp;
			temp++;
		} while (temp <= n);
		System.out.println(sum);
	}
}
