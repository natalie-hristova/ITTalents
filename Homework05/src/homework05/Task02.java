package homework05;

import java.util.Scanner;

public class Task02 {
	/*
	 * ���� �� ������� ����� �� �� ���������� ���, ���� ���������� �� ��������
	 * �� ����� ���� �� �����������, � ������� �� �� ���� ��������, �� � �������
	 * ���. ��������, �� �� ������ ����� ����� �� ������.
	 * 
	 */
	public static void main(String[] args) {

		//int[] givenArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Enter the length of the array :");
		Scanner sc = new Scanner(System.in);
		int[] givenArray = new int [sc.nextInt()];
		for (int i = 0; i < givenArray.length; i++) {
			System.out.println("Enter the element at position " + (i+1));
			givenArray[i]=sc.nextInt();
		}
		int[] newArray = new int[givenArray.length];
		int counter = 0;

		for (int i = 0; i < givenArray.length / 2; i++) {
			newArray[i] = givenArray[i];
			newArray[givenArray.length - counter - 1] = newArray[counter];
			counter++;
		}

		if (givenArray.length % 2 != 0) {
			int x = givenArray.length / 2;
			newArray[x] = givenArray[x];
		}

		System.out.print("[");
		for (int i = 0; i < newArray.length; i++) {
			if (i == newArray.length - 1) {
				System.out.print(newArray[i]);
			} else {
				System.out.print(newArray[i] + ", ");
			}
		}
		System.out.print("]");

	}

}
