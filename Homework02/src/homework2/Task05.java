package homework2;

import java.util.Scanner;

public class Task05 {

	// �� �� ������� �� ����������� 2 �����. � �� ��
	// ������� �� ������ ������ ����� �� ��-������� �� ��-��������.

	public static void main(String[] args) {
		System.out.println("Please, enter 2 numbers :");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		if (firstNumber < secondNumber) {
			for (int i = firstNumber; i <= secondNumber; i++) {
				System.out.println(i);
			}
		} else if (firstNumber == secondNumber) {
			System.out.println("The numbers are equal!");
		} else {
			for (int i = secondNumber; i <= firstNumber; i++) {
				System.out.println(i);
			}
		}
	}

}
