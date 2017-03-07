package homework08;

import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

public class Task14 {

	/*
	 * Да се състави метод, който приема за стойност число N и връща стойността
	 * на N! (N факториел).
	 */

	public static void main(String[] args) {
		System.out.println(getFactorial(getNumber()));
	}

	static int getNumber() {
		System.out.println("Factiorial! Enter number, please :");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	static int getFactorial(int n){
		int factorial = 1;
		if (n<1) {
			return 0;
		}else{
			
			for (int i = 1; i <=n; i++) {
				factorial*=i;
			}
		}
		return factorial;
	}
}
