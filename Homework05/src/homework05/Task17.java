package homework05;

import java.util.Scanner;

public class Task17 {
	/**
	 * ���� ������ �� ���������� ����� �� �������� �������������� ������, ��� ��
	 * ���������� � �� ���������� ���������: N1 < N2 > N3 < N4 > N5 <..
	 * ��������� ��������, ����� ��������� ���� �������� � ��������� �����
	 * ������ �� ����� ���������� ������� ����������. ������: 1 3 2 4 3 7 �����:
	 * ��������� ������������ �� �������������� ������ ������
	 */
	public static void main(String[] args) {
		//int[] array = { 1, 3, 2, 4, 3, 7 };
		
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		int[] array = new int [sc.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element at position " + (i+1));
			array[i] = sc.nextInt();
		}
		
		boolean isZigZag = true;

		for (int i = 0; i < array.length - 1; i++) {
			if (i % 2 == 1 && array[i] <= array[i + 1]) {
				isZigZag = false;
				break;
			} else if (i % 2 == 0 && array[i] >= array[i + 1]) {
				isZigZag = false;
				break;
			}
		}

		if (isZigZag) {
			System.out.println("��������� ������������ �� �������������� ������ ������");
		} else {
			System.out.println("�� ��������� ������������ �� �������������� ������ ������");
		}
	}
}
