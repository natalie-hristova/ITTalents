package homework2;

import java.util.Scanner;

public class Task21 {

	// Дадено е наредено тесте карти.
	// Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
	// Поп, Асо.
	// Наредбата по цвят на картите е: спатия, каро, купа, пика.
	// Да се създаде програма, чрез която се въвежда N - число от
	// интервала [1..51] и се извеждат въведения номер карта и
	// останалите по-големи карти от тестето.
	// Пример: 47.
	// Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
	// пика

	public static void main(String[] args) {
		System.out.println("Моля, въведете число в интервала [1,51] : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		number = number - 1;

		if (number > 51 || number < 1) {
			System.out.println("Невалидни данни!");
		} else {
			while (number <= 51) {
				int size = number / 4;

				switch (size) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
					System.out.print(size + 2 + " ");
					break;
				case 9:
					System.out.print("Вале ");
					break;
				case 10:
					System.out.print("Дама ");
					break;
				case 11:
					System.out.print("Поп ");
					break;
				case 12:
					System.out.print("Асо ");
					break;
				default:
					System.out.print("Невалидни данни!");
				}

				int color = number % 4;
				switch (color) {
				case 0:
					System.out.print("спатия, ");
					break;
				case 1:
					System.out.print("каро, ");
					break;
				case 2:
					System.out.print("купа, ");
					break;
				case 3:
					System.out.print("пика, ");
					break;
				}

				number++;
			}
		}
	}
}
