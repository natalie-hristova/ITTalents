package homework05;

import java.util.Scanner;

public class Task13 {
	/*
	 * �� �� ������� ��������, ���� ����� �� ������� ����� � �� ��������� ����
	 * ����� � ������� ������ �������. ����������, ���� �����, �� ���������
	 * �������������� ������ ����� �� ���������� ���������� ����� � 2-����
	 * ������ �������. ������: 99 �����: 1100011
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		int counterNumber = number;
		while (counterNumber > 0) {
			counterNumber /= 2;
			count++;
		}

		byte[] array = new byte[count];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = (byte) ((byte) number % 2);
			number /= 2;

		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		sc.close();
	}

}
