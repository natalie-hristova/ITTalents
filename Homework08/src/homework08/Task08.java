package homework08;

import java.util.Scanner;

public class Task08 {
	/*
	 * �� �� ������� ��������, ���� ����� �� ������� ��� �� ������� (������,
	 * ���). ���������� �� ������ �� ������ ���� ��������� ������ � ���������,
	 * �.�. ���� ����� ������-������� � �������-������ � ���� � ���. 
	 * ����: �����
	 * �����: ��.
	 *  ����: ��������
	 *  �����: ��.
	 */
	public static void main(String[] args) {
		System.out.println("The fact that the word i palindrome i is : "+isPalindrom());
	}
	
	static String getText(){
		System.out.println("Enter the word to check if it is palindrom :");
		Scanner sc = new Scanner (System.in);
		return sc.next();
	}
	
	static boolean isPalindrom(){
		String text = getText();
		boolean isPalindrom = true;
		for (int i = 0; i < text.length()/2; i++) {
			if (text.charAt(i)!= text.charAt(text.length()-1-i)) {
				isPalindrom = false;
				break;
			}
		}
		return isPalindrom;
	}
}
