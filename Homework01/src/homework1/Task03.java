package homework1;

import java.util.Scanner;

public class Task03 {
	// �������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
	// ������������ ������ ���������
	public static void main(String[] args) {

		System.out.println("Enter A : ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("Enter B : ");
		double b = sc.nextDouble();
		double temp = a;
		a = b;
		b = temp;
		System.out.println("The value of a is " + a + ". The value of B is " + b);
	}
}
