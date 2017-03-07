package homework1;

import java.util.Scanner;

public class Task09 {
	// �� �� ������� ��������, ����� ���� �� ��������� 2 ����������
	// ���������� ����� a,b.
	// ���������� �� ������ � ��������� ���� ���������� ����� ��
	// �������������� �� ����� ����� � �����, ����� � ������ �����.
	// ������ �����: a,b - ���������� ����� �� ��������� [10..99].
	// ������: 15, 25
	// �����: 375, 5 �������

	public static void main(String[] args) {
		System.out.println("Enter 2 integers betweeen 10 and 99 :");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
			System.out.println("Please, enter correct numbers!");
		} else {
			int sum = firstNumber * secondNumber;
			System.out.print(sum);
			int modulus = sum % 10;
			if (modulus % 2 == 0) {
				System.out.printf(", %d �����", modulus);
			} else {
				System.out.printf(", %d �������", modulus);
			}
		}
	}
}
