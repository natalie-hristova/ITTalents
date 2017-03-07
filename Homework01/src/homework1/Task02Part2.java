package homework1;

import java.util.Scanner;

public class Task02Part2 {

	public static void main(String[] args) {
		System.out.println("Enter the 2 numbers :");
		Scanner sc = new Scanner(System.in);
		double firstNumber = sc.nextDouble();
		double secondNumber = sc.nextDouble();
		double sum = firstNumber + secondNumber;
		System.out.println("The sum is : " + sum);
		double substraction = firstNumber - secondNumber;
		System.out.println("The substraction is : " + substraction);
		if (secondNumber != 0.0) {
			double devision = firstNumber / secondNumber;
			System.out.println("The devision is : " + devision);
			double modulus = firstNumber % secondNumber;
			System.out.println("The modulus devision is : " + modulus);
		} else {
			System.out.println("Can not be deivded by 0");
		}
	}

}
