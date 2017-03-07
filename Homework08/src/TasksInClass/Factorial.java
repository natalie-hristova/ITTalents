package TasksInClass;

import java.util.Scanner;

public class Factorial {
	// Write a function to find n! factorial
	public static void main(String[] args) {
		System.out.println( "Factorial is : "+findFactorial(getPositive()));
	}
	
	static int getPositive() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please, enter a positive number :");
			n = sc.nextInt();
		} while (n <= 0);
		return n;
	}

	static int findFactorial(int n){
		int result = 1;
		for (int i = 1; i <=n; i++) {
			result*=i;
		}
		return result; 
	}
}
