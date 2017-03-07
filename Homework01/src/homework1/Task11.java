package homework1;

import java.util.Scanner;

public class Task11 {
	// Съставете програма, която по дадено трицифренo число проверява
	// дали числото се дели на всяка своя цифра. Във въведеното число да
	// няма цифра 0
	public static void main(String[] args) {
		System.out.println("Enter number between 100 and 999 : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 100 || number > 999) {
			System.out.println("Please, enter correct number!");
		} else {
			int unit = number % 10;
			int hundred = number / 100;
			int temp = number / 10;
			int ten = temp % 10;

			if (unit == 0 || ten == 0) {
				System.out.println("The number contains 0.");
			} else {
				System.out.println("The number does NOT contain 0.");
				if (number % unit == 0 && number % ten == 0 && number % hundred == 0) {
					System.out.println("The number can be devided to each digits.");
				} else {
					System.out.println("The number can NOT be devided to each digits.");
				}
			}
		}
	}
}
