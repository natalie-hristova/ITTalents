package homework06;

import java.util.Scanner;

public class Task01 {
/**
 ����� �������� ����� 6�5 �� ���������� �����, ����� ��������� ��
 �������� �������������.
 �� �� ������� ��������, ���� ����� �� �������� ���������� �� ������
 � ���-������� � ���-�������� ��������.
 ������:
 48,72,13,14,15
 21,22,53,24,75
 31,57,33,34,35
 41,95,43,44,45
 59,52,53,54,55
 61,69,63,64,65
 �����:
 ���-����� 13;
 ���-������ 95
 */
	public static void main(String[] args) {
//		int[][] array = {
//				{48,72,13,14,15},
//				{21,22,53,24,75},
//				{31,57,33,34,35},
//				{41,95,43,44,45},
//				{59,52,53,54,55},
//				{61,69,63,64,65}
//		};
		System.out.println("You have a marix 6x5 ");
		int [][] array = new int [6][5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Please enter the element at row " +(i+1)+ " and coulmn "+(j+1));
				array[i][j]= sc.nextInt();
			}
		}
		
		 int min = array [0][0];
		 int max = array [0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (min>array[i][j]) {
					min = array[i][j];
				}
				if (max<array[i][j]) {
					max = array[i][j];
				}
			}
		}
		System.out.println("The min is :" + min+ ";");
		System.out.println("The max is : " + max);
	}

}
