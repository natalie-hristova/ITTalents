package homework1;

import java.util.Scanner;

public class Task15 {

//	�� �� ������� ��������, ����� ������� ���������� ����� �� ���������
//	[0..24].
//	���������� �� ������ ������������� ��������� ��������� ���������
//	���.
//	��������� ��:
//	[18..4] - ����� �����;
//	[4..9] - ����� ����;
//	[9..18] - ����� ���
//	������: 10
//	�����: ����� ���
	
	public static void main(String[] args) {
		System.out.println("�������� ���������� ����� �� ��������� [0,24] : ");
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		if (number >24 || number <0) {
			System.out.println("������� �� �� � �������!");
		}else if(number>18 || number <= 4){
			System.out.println("����� �����");
		}else if (number >4 && number <= 9 ){
			System.out.println("����� ����");
		}else {
			System.out.println("����� ���");
		}
		
	}

	
}
