package homework2;

import java.util.Scanner;

public class Task09 {

	// �� �� �������� 2 ����� �� ������������ � � �.
	// �� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
	// �������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
	// ������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
	// ������������) ����� ��-������ �� 200, �� �� �������� �����������.
	public static void main(String[] args) {
		System.out.println("Enter A & B :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		if (a == b) {
			if (a % 3 == 0) {
				System.out.println("skip 3");
			} else {
				System.out.println(a * a);
			}
		} else {
			int i = a + 1;
			int sum = a * a;

			if (a % 3 == 0) {
				System.out.print("skip " + a);
			} else {
				System.out.print(a * a);
			}
			do {
				if (i % 3 != 0) {
					System.out.print("," + i * i);
					sum += i * i;
				} else {
					System.out.print(", skip " + i);
				}
				i++;
			} while (sum <= 200 && i <= b);
		}
	}
}
