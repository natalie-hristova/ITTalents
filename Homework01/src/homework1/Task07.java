package homework1;

import java.util.Scanner;

public class Task07 {
	// Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
	// пари (число с плаваща запетая), дали съм здрав – булев тип.
	// Съставете програма, която взема решения на базата на тези данни по
	// следния начин:
	// - ако съм болен, няма да излизам
	// - ако имам пари, ще си купя лекарства
	// - ако нямам – ще стоя вкъщи и ще пия чай
	// - ако съм здрав, ще отида на кино с приятели
	// - ако имам по-малко от 10 лв, ще отида на кафе.
	// Полученото решение покажете като съобщение в конзолата.

	public static void main(String[] args) {
		System.out.println("Enter an hour :");
		Scanner sc = new Scanner(System.in);
		byte hour = sc.nextByte();
		System.out.println("Enter ammount of money : ");
		float money = sc.nextFloat();
		System.out.println("Enter \"true\" if you are healty or \"false\" if you are not.");
		boolean iAmHealty = sc.nextBoolean();

		if (iAmHealty) {
			System.out.println("I am going to cinema  with my friends.");
			if (money > 0 && money < 10 && hour > 8 && hour < 13) {
				System.out.println("I will drink my morning  coffee!");
			}
		} else {
			System.out.println("I am not going anywhere !");
			if (money > 0) {
				System.out.println("I will go and buy a pill");
			} else {
				System.out.println("I will stay at home, drinking tea.");
			}
		}
	}
}
