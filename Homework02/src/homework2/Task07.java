package homework2;

import java.util.Scanner;

public class Task07 {

	// Започвайки от 3, да се изведат на екрана първите n
	// числа които се делят на 3. Числата да са разделени със запетая.

	public static void main(String[] args) {
		System.out.println("Въведете n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Number is NOT valid!");
		} else if (n == 1) {
			System.out.println(3);
		} else {
			for (int i = 3; i < n * 3; i += 3) {
				System.out.print(i + ",");
			}
			System.out.println(n * 3);
		}
	}
}
