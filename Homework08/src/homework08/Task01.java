package homework08;

import java.util.Scanner;

public class Task01 {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� ��� ���� ��������� �� 40
	 * ������ � ����� �����. ���� �������� �� ������ �� �� �������� ��������
	 * ���� � ������ � ���� � ����� �����. 
	 * ������: Abcd Efgh 
	 * �����: ABCD abcd EFGH efgh
	 */
	public static void main(String[] args) {
		String firstString = validString();
		String secondString = validString();
		printAllToUpperAndLower(firstString);
		printAllToUpperAndLower(secondString);
	}

	static void printAllToUpperAndLower(String mixedText ){
		System.out.print(mixedText.toUpperCase() + " ");
		System.out.println(mixedText.toLowerCase());
	}
	
	static String validString(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text : ");
		String text =sc.nextLine();
		while(text.length() > 40 || text.isEmpty()){
			System.out.println("Enter valid data :");
			text = sc.nextLine();
		}
		return text;
	}
}
