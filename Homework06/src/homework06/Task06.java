package homework06;

import java.util.Scanner;

public class Task06 {
	
	/*
	 * ����� ������������� �������� ��������� �� ���������� �����.
	������� �� �������� � ��������� ������� � ������� 6 ���� � 6
	������.
	�� �� ������� ��������, ���� ����� �� ������ ������ �� ������
	�������� �� �������� � ����� ������: 2,4 � 6.
	���������� �� ������� � ������ �� ����� ������� ���.
		������:
	11,12,13,14,15,16,
	21,22,23,24,25,26,
	31,32,33,34,35,36,
	41,42,43,44,45,46,
	51,52,53,54,55,56,
	61,62,63,64,65,66
		�����:
	21,22,23,24,25,26 ���� 141
	41,42,43,44,45,46 ���� 261
	61,62,63,64,65,66 ���� 381
	���� �� ���������� 783
	 */

	public static void main(String[] args) {
		
//		int [][] array = {
//				{11,12,13,14,15,16,},
//				{21,22,23,24,25,26,},
//				{31,32,33,34,35,36,},
//				{41,42,43,44,45,46,},
//				{51,52,53,54,55,56,},
//				{61,62,63,64,65,66},
//		};
		int[][] array= new int [6][6];
		System.out.println("��������� � 6�6.");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("�������� ������� �� ��� "+ (i+1)+" � ������ "+ (j+1));
				array[i][j]=sc.nextInt();
			}
		}
		
		int sumOfRow=0;
		int sum=0;
		
		for (int i = 1; i < array.length; i+=2) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ",");
				sumOfRow+= array[i][j];
			}
			System.out.println(" ���� = "+ sumOfRow);
			sum+= sumOfRow;
			sumOfRow=0;
		}
		System.out.println("���� �� ���������� "+sum);
	}
}
