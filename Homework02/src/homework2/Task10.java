package homework2;

import java.util.Scanner;

public class Task10 {

	// �������� ����� �� ������������ � ���������� ���� �
	// ������. ������ ����� � ���� ����� �� ���� ���� �� 1 � �� ����
	// ��.

	public static void main(String[] args) {
		System.out.println("Please, enter a number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isSimple = true;

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				isSimple = false;
				break;
			}
		}
		System.out.println("This number is simple - " + isSimple);
	}
}
