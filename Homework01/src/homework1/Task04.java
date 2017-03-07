package homework1;

import java.util.Scanner;

public class Task04 {

	// Въведете 2 различни числа от конзолата и ги разпечатайте в
	// нарастващ ред.

	public static void main(String[] args) {

		System.out.println("Enter the 2 numbers : ");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		if (firstNumber < secondNumber) {
			System.out.println("In increasing order the numbers are : " + firstNumber + ", " + secondNumber);
		} else if (firstNumber == secondNumber) {
			System.out.println("The numbers are equal!");
		} else {
			System.out.println("In increasing order the numbers are : " + secondNumber + ", " + firstNumber);
		}
	}
}
