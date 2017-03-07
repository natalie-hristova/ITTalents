package homework1;

import java.util.Scanner;

public class Task16 {

	// Въведено е трицифрено естествено число от вида abc.
	// Трябва да се провери дали:
	// ако a = b = c - Изход: цифрите са равни;
	// ако a>b>c - Изход: цифрите са във възходящ ред;
	// ако a<b<c цифрите са в низходящ ред;
	// и изход: цифрите са ненаредени, за неописаните случаи.
	// Да се състави програма, която извежда резултата от проверката за
	// наредба на цифрите в числото.

	// Искам само да попитам по условието - възходящ и низходящ не трябва ли да
	// са обратното ???

	public static void main(String[] args) {
		System.out.println("Въведете трицифрено число : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 100 || number > 999) {
			System.out.println("Числото Ви НЕ е валидно!");
		} else {
			int a = number / 100;
			int b = (number / 10) % 10;
			int c = number % 10;
			if (a == b && b == c) {
				System.out.println("цифрите са равни");
			} else if (a > b && b > c) {
				System.out.println("цифрите са във възходящ ред");
			} else if (a < b && b < c) {
				System.out.println("цифрите са в низходящ ред");
			} else {
				System.out.println("цифрите са ненаредени, за неописаните случаи.");
			}
		}
	}
}
