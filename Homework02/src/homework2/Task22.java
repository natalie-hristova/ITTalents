package homework2;

import java.util.Scanner;

public class Task22 {

	// �� �� ������� ��������, ����� ������� ������� 10 ���-�����
	// �����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
	// �������� ���������� �����.
	// ������� �� ��������, ������ � ������ ������� �����.
	// ������ �����: ����� �� ��������� [1..999]
	// ������: 1
	// �����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14

	public static void main(String[] args) {
		System.out.println("Enter N :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int outputNumbers = n + 1;
		int count = 0;
		while (count < 10) {

			if (outputNumbers % 2 == 0 || outputNumbers % 3 == 0 || outputNumbers % 5 == 0) {
				count++;
				System.out.print(count + ":" + outputNumbers + ", ");
			}
			outputNumbers++;
		}

	}
}
