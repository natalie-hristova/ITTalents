import java.util.Scanner;

public class Task03 {
	/*
	 * �� �� ������� ��������, ����� ��������� ���� �������� ���������� ����� �
	 * ������. 
	 * ������: 101
	 *  �����: ������
	 */
	public static void main(String[] args) {
		int number =getPositiveNumber();
		double devider = Math.sqrt(number);
	System.out.println("The number is simple :" +isSimple(number,(int)devider));
	}
	
	static int getPositiveNumber() {
		int n = 0;
		while (n < 1) {
			System.out.println("Enter possitive number bigger than 1 :");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		}
		return n;
	}
	
	static boolean isSimple(int n,int i){
		if(i<=1){
			return true;
		}
		if(n<=3){
			return true;
		}
		if(n%i==0){
		
				return false;
			}
		return (isSimple(n,i-1));
	}
}
