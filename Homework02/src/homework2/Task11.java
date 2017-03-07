package homework2;

import java.util.Scanner;

public class Task11 {
	// Въведете число N чрез конзолата и изкарайте като
	// резултат следния триъгълник с височина N:
	//   *
	//  ***
	// *****
	// .................
	// Кaто допълнително упражнение – нарисувайте същия
	// триъгълник, но незапълнен.

	public static void main(String[] args) {
		System.out.println("Please , enter N (for the full triangle) :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid data! ");
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2 + 1); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
