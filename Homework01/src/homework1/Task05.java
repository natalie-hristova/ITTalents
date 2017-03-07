package homework1;

import java.util.Scanner;

public class Task05 {
	// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
	// ред.
	public static void main(String[] args) {
		System.out.println("Enter 3  integers : ");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();

		System.out.print("The numbers in decreasing order are : ");
		if (firstNumber > secondNumber) {
			if ((firstNumber > thirdNumber) && (thirdNumber > secondNumber)) {
				System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
			} else if ((firstNumber > thirdNumber) && (thirdNumber < secondNumber)) {
				System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
			} else if ((firstNumber < thirdNumber)) {
				System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
			}
		} else if ((secondNumber > thirdNumber) && (firstNumber > thirdNumber)) {
			System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
		} else if ((secondNumber > thirdNumber) && (thirdNumber > firstNumber)) {
			System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
		} else if ((secondNumber < thirdNumber)) {
			System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
		}
	}
}
