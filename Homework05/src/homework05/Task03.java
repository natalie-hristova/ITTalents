package homework05;

import java.util.Scanner;

public class Task03 {
	/*
	 * �� �� ������ �����, ���� ����� �� �� ������� ����� � 10 �������� ��
	 * ������� �����: ������� 2 �������� �� ������ �� ���������� �����. �����
	 * ������� ������� �� ������ � ����� �� ����� �� ���������� 2 �������� �
	 * ������. ���� ���� �������� ������ .
	 */

	public static void main(String[] args) {
		int[] array = new int[10];
		System.out.println("Fibunacci. Enter the first number:");
		Scanner sc = new Scanner(System.in);
		array[0] = sc.nextInt();
		array[1] = array[0];

		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
