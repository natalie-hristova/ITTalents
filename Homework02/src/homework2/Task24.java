package homework2;

import java.util.Scanner;

public class Task24 {

	// Едно число X е палиндром, aко се чете еднакво отпред назад и
	// отзад напред.
	// Да се състави програма, която проверява дали въведено число е
	// палиндром.
	// Входни данни: N - естествено число от интервала [10 .. 30000].
	// Пример: 17571
	// Изход: числото е палиндром
	// Използвайте цикъл do-while.

	public static void main(String[] args) {
		System.out.println("Palimdromes! Please, enter X :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPalindrome = true;
		int count = 1;
		int tenNumber = n;

		do {
			tenNumber = tenNumber / 10;
			count++;

		} while (tenNumber > 9);

		int nUnits = n;
		int nTen = n;

		do {
			int unit = nUnits % 10;
			nUnits /= 10;
			int s = 1;
			for (int i = 1; i < count; i++) {
				s *= 10;
			}

			nTen %= 10 * s;
			int ten = nTen / (s);
			count--;
			if (unit != ten) {
				isPalindrome = false;
				break;
			}
		} while (count > 1);

		System.out.println(n + " is palindrome : " + isPalindrome);
	}
}
