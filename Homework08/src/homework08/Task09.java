package homework08;

import java.util.Scanner;

public class Task09 {
	/*
	 * Да се състави програма, чрез която по въведен низ съдържащ букви, цифри,
	 * знак минус '-' се извежда сборът на въведените числа като се отчита
	 * знакът '-' пред съответното число.
	 *  Вход: asd-12sdf45-56asdf100 
	 *  Изход: -12 45 -56 100
	 *  Сума = 77
	 */

	public static void main(String[] args) {
		getSum();
	}
	
	static String getText(){
		System.out.println("Enter the word get sum of its numbers :");
		Scanner sc = new Scanner (System.in);
		return sc.next();
	}
	
	static int getSum(){
		String symbols = getText();
		int wholeNumber =0;
		int number = 0;
		int umn = 1;
		int sum = 0;
		for (int i = symbols.length()-1; i >=0; i--) {
			if (symbols.charAt(i)>='0' && symbols.charAt(i)<='9') {
				number = (symbols.charAt(i)-48)* umn;
				umn*=10;
				wholeNumber+=number;
			//System.out.println(" whole number  "+ wholeNumber);
		}else if(symbols.charAt(i)=='-'){
			System.out.print(-wholeNumber + " ");
			sum-=wholeNumber;
			umn = 1;
			number=0;
			wholeNumber=0;
		}else{
			if (wholeNumber!=0) {
				System.out.print(wholeNumber+ " ");
				sum+=wholeNumber;
				umn = 1;
				number=0;
				wholeNumber=0;
			}
		}
		}
		System.out.println();
		System.out.println(sum);
		return sum;
	}
}
