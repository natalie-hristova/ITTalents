package homework1;

import java.util.Scanner;

public class Task10 {

	// ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
	// 3 ����� � �� �������� ������������.
	// �� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
	// ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
	// ������. ������ �� ����� �� �� ������� � �������� ���������� ����.
	// ������ �����: ���������� ����� �� ��������� [10..9999].
	// ������: 107
	// �����: 21 ���� �� 2 �����,
	// 21 ���� �� 3 �����
	// ������������ ���� �� 2 �����

	public static void main(String[] args) {
		System.out.println("Enter the litres: ");
		Scanner sc = new Scanner(System.in);
		int litres = sc.nextInt();
		int fullBins = litres / 5;
		int remain = litres % 5;
		System.out.println(fullBins + " ���� �� 2 �����." + "\n" + fullBins + " ���� �� 3 �����.");
		if (remain == 3 || remain == 2) {
			System.out.printf("������������ ���� �� %d �����", remain);
		} else if (remain > 0) {
			System.out.printf("������������ %d �����", remain);
		}
	}
}
