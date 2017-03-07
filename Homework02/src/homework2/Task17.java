package homework2;

import java.util.Scanner;

public class Task17 {

	// Да се състави програма, която извежда квадрат, чийто страни са
	// оформени със знака *, а вътрешността е запълнена със въведен
	// знак.
	// Входни данни b - дължина на страната число от интервала
	// [3..20], c - желан знак.
	// Програмата да използва цикъл for.
	public static void main(String[] args) {
		System.out.println("Enter the side of the square and the symbol :");
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		char symbol = sc.next().charAt(0);

		for (int i = 0; i < side; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i < side - 1; i++) {
			System.out.print("*");
			for (int j = 0; j < side - 2; j++) {
				System.out.print(symbol);
			}
			System.out.println("*");
		}
		for (int i = 0; i < side; i++) {
			System.out.print("*");
		}
	}
}
