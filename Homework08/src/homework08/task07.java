package homework08;

import java.util.Scanner;

public class task07 {
	/*
	 * �� �� ������� ��������, ����� ���� ����� �� ���� ��������� � ��������.
	 * ���� �������� �� �� �������� ���� �� ���������� ����, ����� � ���� �����
	 * � ���-������� ����.
	 *  ������: asd fg hjkl 
	 *  �����: 3 ����, ���-������� � � 4 �������
	 */

	public static void main(String[] args) {
		wordCouterSizeAndNumber();
		
	}
	
	static void wordCouterSizeAndNumber(){
		Scanner sc= new Scanner(System.in);
		int counter = 1;
		int longestWord =0;
		int max = 0;
		System.out.println("Please enter text :");
		String text = sc.nextLine();
		String[] array = text.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >max) {
				max = array[i].length();
			}
		}
		System.out.println(array.length + " words, the longest is with " + max + " symbols");
	}
}
