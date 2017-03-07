package homework08;

import java.util.Scanner;
import java.util.jar.Manifest;

public class Task10 {
	/*
	 * �� �� ������� ��������, ����� �� ����� ��� ����� ����, ���������, ��
	 * ����� �� �������� ���� ��� ����� ��� �� ������ �� ASCII ��������� �
	 * ���������� ������� 5 � � ������� ������������� ������.
	 *  ������ :����: Hello 
	 *  �����: Mjqqt
	 */

	public static void main(String[] args) {
		System.out.println(makeNewString());
	}
	
	static String getText(){
		System.out.println("Enter text :");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	static String makeNewString(){
		String text = getText();
		StringBuilder newText = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			newText.append((char)(text.charAt(i)+5));
		}
		return newText.toString();	
	}
}
