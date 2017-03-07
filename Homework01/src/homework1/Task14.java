package homework1;

import java.util.Scanner;

public class Task14 {
	// �� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
	// �� ���������� ����� ������� ������� ���� �� �������� � ������� ���
	// �������� ����.
	// ���������� ����� � ���������.
	// �������� �� ��� ������ ����� �� ��������� [1..8].
	// ������: 2 2 3 2
	// �����: ��������� �� � �������� ����
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers between 1 and 8 for the first coordinate:");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter 2 numbers between 1 and 8 for the second coordinate:");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		if (x1 < 1 || x1 > 8 || x2 < 1 || x2 > 8 || y1 < 1 || y1 > 8 || y2 < 1 || y2 > 8) {
			System.out.println("Not correct coordinates!");
		} else {
			boolean firstCoupleIsBlack = false;
			if ((y1 % 2 == 1 && x1 % 2 == 1) || (y1 % 2 == 1 && x1 % 2 == 1)) {
				firstCoupleIsBlack = true;
			}

			boolean secondCoupleIsBlack = false;
			if ((y2 % 2 == 1 && x2 % 2 == 1) || (y2 % 2 == 1 && x2 % 2 == 1)) {
				secondCoupleIsBlack = true;
			}
			if (!(secondCoupleIsBlack ^ firstCoupleIsBlack)) {
				System.out.println("��������� �� � ������� ����");
			} else {
				System.out.println("��������� �� � �������� ����");
			}
		}

	}
}
