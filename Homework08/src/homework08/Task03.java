package homework08;

import java.util.Scanner;

public class Task03 {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� �������������� ��� ������
	 * �� ������� ��� ���������. ���������� �� ������� ��������� �� ��������� ��
	 * ����������� �� �� �������. 
	 * ������: ���������, ���������
	 *  �����: ����� ���� �� � ����� �������. ������� �� �������: 8 �-� 9 �-�
	 */
	public static void main(String[] args) {
		String word1=getText();
		String word2 = getText();
		stringComparer(word1, word2);
	}

	static String getText(){
		System.out.println("Enter text :");
		Scanner sc= new Scanner(System.in);
		String word = sc.next();
		 return word;
	}
	
	static void stringComparer(String word1, String word2){
		if (word1.length()== word2.length()) {
			System.out.println("Both strings have equal sizes.");
			for (int i = 0; i < word2.length(); i++) {
				if (!(word1.charAt(i)==word2.charAt(i))) {
					System.out.printf("Difference in possition %d %s-%s \n",i,word1.charAt(i),word2.charAt(i));
				}
			}
		}else{
			System.out.println("The strings DO NOT have equal sizes.");
		}
		
	}
}
