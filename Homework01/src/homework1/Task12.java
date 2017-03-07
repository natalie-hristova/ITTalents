package homework1;

import java.util.Scanner;

public class Task12 {
	// ��������� ������ �� ������ ������ ������ �� 4 � ����������
	// ����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
	// �� 1600 � 2000 �� ���������.
	// ��������� ��������, ����� �� ������ ���, �����, ������ ���������
	// ���������� ����.
	// ������ �����: ��� ����� �� ���, �����, ������.
	// ������: 28, 2, 2000
	// �����: 1,3,2000

	public static void main(String[] args) {
		System.out.println("Enter numbers for : day, month and year : ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		boolean isLeap = false;
		if (year % 4 == 0 && year % 400 != 0) {
			isLeap = true;
		}

		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
			month++;
			System.out.println("1," + month + "," + year);
		} else if (month == 12 && day == 31) {
			year++;
			System.out.println("1,1," + year);
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
			month++;
			System.out.println("1," + month + "," + year);
		} else if ((isLeap && month == 2 && day >= 29) || (!isLeap && month == 2 && day >= 28)) {
			System.out.println("1,3," + year);
		} else {
			day++;
			System.out.println(day + "," + month + "," + year);
		}
	}
}
