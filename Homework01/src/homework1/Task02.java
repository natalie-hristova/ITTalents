package homework1;

import java.util.Scanner;

public class Task02 {
	// Въведете 2 различни цели числа от конзолата. Запишете тяхната сума,
	// разлика, произведение, остатък от деление и целочислено деление в
	// отделни променливи и разпечатайте тези резултати в конзолата.
	// Опитайте същото с числа с плаваща запетая.
	public static void main(String[] args) {
		System.out.println("Enter 2 integers :");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println("The sum is : " + sum);
		int substraction = firstNumber - secondNumber;
		System.out.println("The substraction is : " + substraction);
		int multiplication = firstNumber * secondNumber;
		System.out.println("The multiplication is : " + multiplication);
		if (secondNumber == 0) {
			System.out.println("NO kind of devision is allowed!");
		} else {
			int devision = firstNumber / secondNumber;
			System.out.println("The result of the devision is : " + devision);
			int modulus = firstNumber % secondNumber;
			System.out.println("The result of modulus devision is : " + modulus);
		}
	}

}
