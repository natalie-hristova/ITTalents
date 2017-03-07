package homework1;

import java.util.Scanner;

public class Task08 {
	// Да се състави програма, която чете от конзолата 4-цифренo
	// естествено число от интервала [1000.. 9999]. От това число се
	// формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
	// и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
	// 3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
	// ново число e по-малко <, равно = или по-голямо от 2-то число.

	// Пример: 3332 Изход: по-малко (32<33)
	// Пример: 1144 Изход: равни (14=14)
	// Пример: 9875 Изход: по-голямо (95>87)
	public static void main(String[] args) {
		System.out.println("Enter nuumber between 1000 and 9999 :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 1000 || number > 9999) {
			System.out.println("Choose another number, please!");
		} else {

			int getLastNumber = number % 10;
			int getFirstNumber = number / 1000;
			int firstNewNumber = getFirstNumber * 10 + getLastNumber;
			number = number / 10;
			getLastNumber = number % 10;
			getFirstNumber = number / 10 % 10;
			int secondNewNumber = getFirstNumber * 10 + getLastNumber;
			if (firstNewNumber < secondNewNumber) {
				System.out.printf("По-малко (%s<%d) ", firstNewNumber, secondNewNumber);
			} else if (firstNewNumber > secondNewNumber) {
				System.out.printf("По-голямо (%d>%d)", firstNewNumber, secondNewNumber);
			} else {
				System.out.printf("Равни (%d=%d)", firstNewNumber, secondNewNumber);
			}
		}
	}
}
