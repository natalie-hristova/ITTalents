package homework1;

import java.util.Scanner;

public class Task14 {
	// Да се състави програма, която по въведени координати на 2 позиции
	// от шахматната дъска извежда отговор дали са оцветени в еднакъв или
	// различен цвят.
	// Шахматната дъска е квадратна.
	// Въвеждат се две двойки числа от интервала [1..8].
	// Пример: 2 2 3 2
	// Изход: Позициите са с различен цвят
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers between 1 and 8 for the first coordinate:");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter 2 numbers between 1 and 8 for the second coordinate:");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		if (x1 < 1 || x1 > 8 || x2 < 1 || x2 > 8 || y1 < 1 || y1 > 8 || y2 < 1 || y2 > 8) {
			System.out.println("Not correct coordinates!");
		} else {
			boolean firstCoupleIsBlack = false;
			if ((y1 % 2 == 1 && x1 % 2 == 1) || (y1 % 2 == 1 && x1 % 2 == 1)) {
				firstCoupleIsBlack = true;
			}

			boolean secondCoupleIsBlack = false;
			if ((y2 % 2 == 1 && x2 % 2 == 1) || (y2 % 2 == 1 && x2 % 2 == 1)) {
				secondCoupleIsBlack = true;
			}
			if (!(secondCoupleIsBlack ^ firstCoupleIsBlack)) {
				System.out.println("Позициите са с еднакъв цвят");
			} else {
				System.out.println("Позициите са с различен цвят");
			}
		}

	}
}
