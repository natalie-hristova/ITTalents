package homework2;

import java.util.Scanner;

public class Task21 {

	// ������ � �������� ����� �����.
	// ��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����,
	// ���, ���.
	// ��������� �� ���� �� ������� �: ������, ����, ����, ����.
	// �� �� ������� ��������, ���� ����� �� ������� N - ����� ��
	// ��������� [1..51] � �� �������� ��������� ����� ����� �
	// ���������� ��-������ ����� �� �������.
	// ������: 47.
	// �����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ���
	// ����

	public static void main(String[] args) {
		System.out.println("����, �������� ����� � ��������� [1,51] : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		number = number - 1;

		if (number > 51 || number < 1) {
			System.out.println("��������� �����!");
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
					System.out.print("���� ");
					break;
				case 10:
					System.out.print("���� ");
					break;
				case 11:
					System.out.print("��� ");
					break;
				case 12:
					System.out.print("��� ");
					break;
				default:
					System.out.print("��������� �����!");
				}

				int color = number % 4;
				switch (color) {
				case 0:
					System.out.print("������, ");
					break;
				case 1:
					System.out.print("����, ");
					break;
				case 2:
					System.out.print("����, ");
					break;
				case 3:
					System.out.print("����, ");
					break;
				}

				number++;
			}
		}
	}
}
