package homework05;

import java.util.Scanner;

public class Task07 {
	/*
	 * �������� ��������, ����� ����� ���� ����� � ����� ������� ��� ����� ���
	 * ����� ������ �� ������� �����: ���������� �� ����� ������� �� ������
	 * ����� �� � ����� �� ����� �� ���������� � ���������� ������� ��
	 * ���������� ������� �� ������ �����. ������� � ���������� ������� ��
	 * ������ ����� ������ �� �� ������� ����� �� ������� � ���������� ��
	 * ������� �� ������ �����. �� �� ������ ��������� �����.
	 */
	public static void main(String[] args) {

		//int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Enter the length of the array :");
		Scanner sc = new  Scanner(System.in);
		int[] array =new int [sc.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element at position " + (i+1));
			array[i]= sc.nextInt();
		}
		
		int[] newArray = new int[array.length];
		newArray[0] = array[0];
		newArray[array.length - 1] = array[array.length - 1];

		for (int i = 1; i < newArray.length - 1; i++) {
			newArray[i] = array[i - 1] + array[i + 1];
		}

		System.out.println("The new array is : ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}

}
