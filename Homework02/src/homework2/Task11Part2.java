package homework2;

import java.util.Scanner;

public class Task11Part2 {

	// �������� ����� N ���� ��������� � ��������� ����
	// �������� ������� ���������� � �������� N:
	//   *
	//  * *
	// *   *
	// .................
	// �a�� ������������ ���������� � ����������� �����
	// ����������, �� ����������.
	public static void main(String[] args) {
		System.out.println("Please, enter N (for the emtpy triangle ):");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1-i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print(" ");
			}
			if (i > 0) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
