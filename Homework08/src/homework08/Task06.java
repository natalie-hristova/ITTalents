package homework08;

import java.util.Scanner;

public class Task06 {
	/*
	 * �� �� ������� ��������, ���� ����� �� ������� ��������� � ������� ����.
	 * ���� �������� �� ������ �� �� ������� ����� �����, �� ����� ������� ����
	 * �� ������� � ������ �����, � ���������� � ����� �� �� �����. 
	 * ������:����� ����� �����a
	 * �����: ����� ����� ������
	 * 
	 */

	public static void main(String[] args) {
		sentanceWords();
	}
	
	static String[] getText(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your text : ");
		String text = sc.nextLine();
		String [] array =text.split(" ");
		return array;
		}
	
	static void sentanceWords(){
		String [] array = getText();
		for (int i = 0; i < array.length; i++) {
			array[i]= array[i].toLowerCase(); 
		}
		for (int i = 0; i < array.length; i++) {
			char c =(char)(array[i].charAt(0)-32);
			System.out.print(c);
			System.out.print(array[i].substring(1, array[i].length())+ " ");
		}
	}
	
}

