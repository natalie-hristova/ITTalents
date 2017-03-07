package homework06;

import java.util.Scanner;

public class Task05 {
	/*
	 * �� �� ������� ��������, ��� ����� ������������� �� ��������
	���������� ����� � �������� ����� 4*4 ��������.
	���������� �� ������� �������� �� ���������� ����� � �������������
	�� ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������.
	������:
	1,2,3,4
	5,6,7,8
	9,10,11,12
	13,14,15,16

	�����:
	���-������ ���� �� ������ 58
	���-������ ���� �� ������ 40
	������������ ���� �� ������ � > �� ������������ ���� �� ������
	 */
	public static void main(String[] args) {
//		int [][] array = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12},
//				{13,14,15,16},
//		};
		System.out.println("��������� � 4�4.");
		Scanner sc = new  Scanner (System.in);
		
		int [][] array =new int [4][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("�������� ������� �� ��� "+ (i+1)+" � ������ "+ (j+1));
				array[i][j]=sc.nextInt();
			}
		}
		
		int sumOfCols=0;
		int sumOfRows=0;
		int maxSumOfCols=0;
		int maxSumOfRows=0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumOfCols+=array[i][j];
				sumOfRows += array[j][i];
			}
				if (maxSumOfCols<sumOfCols) {
				maxSumOfCols= sumOfCols;
				}
				sumOfCols=0;
				
				if (maxSumOfRows<sumOfRows) {
					maxSumOfRows=sumOfRows;
				}
				sumOfRows=0;
		}
		
		System.out.println("���-������ ���� �� ������ "+maxSumOfRows);
		System.out.println("���-������ ���� �� ������ "+maxSumOfCols);
		System.out.print("������������ ���� �� ������ � ");
		if (maxSumOfCols > maxSumOfRows) {
			System.out.print("> ��");
		}else if(maxSumOfCols < maxSumOfRows){
			System.out.print("< ��");
		}else{
			System.out.print("= ��");
		}
		System.out.println(" ������������ ���� �� ������");
		
	}

}
