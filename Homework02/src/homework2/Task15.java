package homework2;

import java.util.Scanner;

public class Task15 {

	// �� �� ������� ��������, ����� �� ������� ������ ��
	// ������ ����� �� 1 �� �������� ����� N.
	// ������: 5
	// �����: 15
	// ����������� ����� do-while.
	public static void main(String[] args) {
		System.out.println("Please enter N : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 1;
		int sum = 0;
		do {
			sum += temp;
			temp++;
		} while (temp <= n);
		System.out.println(sum);
	}
}
