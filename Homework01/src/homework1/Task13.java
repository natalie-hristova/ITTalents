package homework1;

import java.util.Scanner;
import javax.xml.transform.Templates;

public class Task13 {
	// �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
	// ���������� ����������� t � ������ ������.
	// �������������� ��������� ��:
	// ��� -20 ������ �������;
	// ����� 0 � -20 - �������;
	// ����� 15 � 0 - ������;
	// ����� 25 � 15 - �����;
	// ��� 25 � ������.
	// ������ �����: ���� ����� �� ��������� [-100..100].
	// ������: 12
	// �����: ������
	
	public static void main(String[] args) {
		System.out.println("Enter the temperature in Celsius : ");
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();
		if (temperature < -100 || temperature > 100) {
			System.out.println("Please, enter valid data");
		} else {
			if (temperature <= -20) {
				System.out.println("������ �������");
			} else if (temperature < 0) {
				System.out.println("�������");
			} else if (temperature <= 15) {
				System.out.println("������");
			} else if (temperature <= 25) {
				System.out.println("�����");
			} else {
				System.out.println("������");
			}
		}
	}
}
