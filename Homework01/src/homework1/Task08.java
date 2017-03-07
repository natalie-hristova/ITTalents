package homework1;

import java.util.Scanner;

public class Task08 {
	// �� �� ������� ��������, ����� ���� �� ��������� 4-������o
	// ���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
	// �������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
	// � 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
	// 3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
	// ���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.

	// ������: 3332 �����: ��-����� (32<33)
	// ������: 1144 �����: ����� (14=14)
	// ������: 9875 �����: ��-������ (95>87)
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
				System.out.printf("��-����� (%s<%d) ", firstNewNumber, secondNewNumber);
			} else if (firstNewNumber > secondNewNumber) {
				System.out.printf("��-������ (%d>%d)", firstNewNumber, secondNewNumber);
			} else {
				System.out.printf("����� (%d=%d)", firstNewNumber, secondNewNumber);
			}
		}
	}
}
