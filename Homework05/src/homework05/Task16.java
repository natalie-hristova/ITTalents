package homework05;

import java.util.Scanner;

public class Task16 {
	/*
	 * �� �� ������� ��������, ���� ����� ������������� �������� 10 ������ �����
	 * �� ��������� �� ���������� �� ������� �����: 1. �������
	 * �������������������.
	 * 
	 * 2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ��� ������
	 * �� �������� �� �������� �� ����� + ������� 41.25, � ������ ��������
	 * �������� �� ������� � �������������� ����� ����� ������� � ��������
	 * ������� �����. ��������� ����� �� ������� ������� � 1. 3. �� �� �������
	 * ���������� �� �������� � ��������������� �����. ������: -1.12, -2.43,
	 * 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4 �����: 42.25, 45.25, 9.3, 16.8, 0,
	 * 38.4, 90.25, 68.8, 81.9,141.25
	 * 
	 */
	public static void main(String[] args) {

//		double[] array = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		double[] array = new double [sc.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter any  number at element " + (i+1));
			array[i]=sc.nextDouble();
		}

		System.out.println("Old array : ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < -0.231) {
				array[i] = (i + 1) * (1 + i) + 41.25;
			} else {
				array[i] *= (1 + i);
			}
		}
		System.out.println();
		System.out.println("New array :");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}

}
