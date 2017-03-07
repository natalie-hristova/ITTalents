package homework2;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		System.out.println("Enter n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid number!");
		} else {
			int newNumber = n - 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(newNumber + i * 2);
				}
				System.out.println();
			}
		}
	}
}
