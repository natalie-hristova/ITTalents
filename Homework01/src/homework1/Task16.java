package homework1;

import java.util.Scanner;

public class Task16 {

	// �������� � ���������� ���������� ����� �� ���� abc.
	// ������ �� �� ������� ����:
	// ��� a = b = c - �����: ������� �� �����;
	// ��� a>b>c - �����: ������� �� ��� �������� ���;
	// ��� a<b<c ������� �� � �������� ���;
	// � �����: ������� �� ����������, �� ����������� ������.
	// �� �� ������� ��������, ����� ������� ��������� �� ���������� ��
	// ������� �� ������� � �������.

	// ����� ���� �� ������� �� ��������� - �������� � �������� �� ������ �� ��
	// �� ��������� ???

	public static void main(String[] args) {
		System.out.println("�������� ���������� ����� : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 100 || number > 999) {
			System.out.println("������� �� �� � �������!");
		} else {
			int a = number / 100;
			int b = (number / 10) % 10;
			int c = number % 10;
			if (a == b && b == c) {
				System.out.println("������� �� �����");
			} else if (a > b && b > c) {
				System.out.println("������� �� ��� �������� ���");
			} else if (a < b && b < c) {
				System.out.println("������� �� � �������� ���");
			} else {
				System.out.println("������� �� ����������, �� ����������� ������.");
			}
		}
	}
}
