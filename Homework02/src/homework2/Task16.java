package homework2;

import java.util.Scanner;

public class Task16 {

	// Да се състави програма, чрез която се въвеждат 2 естествени
	// числа N, M от интервала [10..5555].
	// Програмата, чрез цикъл for, да извежда всички числа от
	// интервала, които са кратни на 50 в низходящ ред.
	// Пример: 25,249
	// Изход: 200,150,100, 50.

	public static void main(String[] args) {
		System.out.println("Please, enter M & N :");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if (m < 10 || m > 5555 || n < 10 || n > 5555) {
			System.out.println("Invalid data!");
		} else {
			if (m > n) {
				int temp = m;
				m = n;
				n = temp;
			}
			for (int i = n; i > m; i--) {
				if (i % 50 == 0) {
					System.out.print(i + "  ");
				}
			}
		}
	}
}
