package homework05;

import java.util.Scanner;

public class Task12 {
	/*
	 * �� �� ������� ��������, ���� ����� �� ������������� �������� 7 ����� �
	 * ��������� ����� �� �������� ������� �� �������� � �������: - 0 � 1 ����
	 * ����� ����������; - 2 � 3 ���� ��������; - 4 � 5 ���� ���������. ������:
	 * 1,2,3,4,5,6,7 �����: 2,1,4,3,6,5,7
	 * 
	 */
	public static void main(String[] args) {
		//int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("The length of the array is 7.");
		Scanner sc = new Scanner (System.in);
		int [] array = new int [7];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element at position "+ (i+1));
			array[i]=sc.nextInt();
		}
		
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];

		if (array[5] == 0 || array[4] == 0) {
			System.out.println("Can not devide by zero!");
		} else {
			array[4] = array[4] * array[5];
			array[5] = array[4] / array[5];
			array[4] = array[4] / array[5];
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
