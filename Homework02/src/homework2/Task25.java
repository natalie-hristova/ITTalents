package homework2;

import java.util.Scanner;

public class Task25 {
	// �� �� ������� ��������, ����� �� ������ ����� N, �� ���������
	// N!, �.�. 1*2*3*4...*N.
	// ������: 5
	// �����: 120
	// ����������� ����� do-while.

	public static void main(String[] args) {
		System.out.println("Factorials! Enter N :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = 1;
		int count = 1;
		do {
			factorial *= count;
			count++;
		} while (count <= n);
		
		System.out.println(factorial);
	}

}
