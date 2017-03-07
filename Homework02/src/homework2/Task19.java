package homework2;

import java.util.Scanner;

public class Task19 {

	// �� �� ������� ��������, ���� ����� �� ��������
	// ���������� ����� �� ��������� [10..99] �� ������� ��������
	// �����, ��� �������� �� �������� ����������:
	// 1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
	// 2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
	// ����������� ���������� ������ �� �� ������ �������� 1.
	// ������: 11
	// �����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1
	
	public static void main(String[] args) {
		System.out.println("Enter number between [10,99]:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 10 || number > 99) {
			System.out.println("Invalid data!");
		} else {
			int n = number;
			while (n > 1) {
				if (n % 2 == 0) {
					n /= 2;
					System.out.print(n + " ");
				} else {
					n = 3 * n + 1;
					System.out.print(n + " ");
				}

			}
		}
	}

}
