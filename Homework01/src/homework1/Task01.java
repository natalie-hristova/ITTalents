package homework1;

import java.util.Scanner;

public class Task01 {
	// �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
	// ������������ A � B (���� �� �� � ������� ������� � double).
	// ����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
	// �� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		System.out.println("�������� A:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		System.out.println("�������� B:");
		b = sc.nextDouble();
		System.out.println("�������� C:");
		c = sc.nextDouble();
		if ((c < a && c > b) || (c > a && c < b)) {
			System.out.println("������� " + c + " � ����� " + a + " � " + b);
		} else {
			System.out.println("������� " + c + " �� � ����� " + a + " � " + b);
		}
	}
}
