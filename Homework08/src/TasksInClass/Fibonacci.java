package TasksInClass;

import java.util.Scanner;

public class Fibonacci {
/*
 *   Write a function to find the n-th number of Finonachi sequence
 */
	public static void main(String[] args) {
		int m = getPositive();
		int fibunacchi= fibunacciNumber(m);
		System.out.println("Fibonacci number at position "+ m + " is "+fibunacchi);
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

	static int fibunacciNumber(int n){
		int firstNumber=1;
		int secondNumber = 1;
		int number=-1;
		if (n==1 || n==2) {
			number=1;
		}else{
			for (int i = 3; i <=n; i++) {
				number = firstNumber+ secondNumber;
				firstNumber=secondNumber;
				secondNumber=number;
			}
		}
		return number;
	}
	
}
