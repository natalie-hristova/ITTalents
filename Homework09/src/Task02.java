import java.util.Scanner;

public class Task02 {

	/*
	 * �� �� ������� ��������, ����� ��������� ������������ �� ��� ����������
	 * ����� =>2, ���� �� �������� ���� ��������. 
	 * ������ �����: 2 ���������� �����. 
	 * ������: 4, 5
	 *  �����: 20
	 */
	public static void main(String[] args) {
		int x = getPositiveNumber();
		int y =getPositiveNumber();
		System.out.println(multiply(x,y));
	}

	static int getPositiveNumber() {
		int n = 0;
		while (n < 2) {
			System.out.println("Enter positive number bigger than 1 :");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		}
		return n;
	}
	
	static int multiply(int number,int times){
		if (times==1) {
			return number;
		}
		return (multiply(number,times-1)+number);
	}
}
