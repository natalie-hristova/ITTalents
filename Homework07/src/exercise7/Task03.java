package exercise7;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Task03 {
	/**
	 * Напишете програма, която за даден масив от символи arr и
символ ch, въведен от потребителя, проверява али arr съдържа
ch. Ако се съдържа, отпечатайте индекса на елемента. Ако не,
отпечатайте подходящо избрана от вас стойност.
	 */
	
	public static void main(String[] args) {
		char[] arr = {'1','@','#','$','%','^','&','*','!'};
		System.out.println("enter your symbol : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		boolean hasSymbol = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (ch== arr[i]) {
				hasSymbol = true;
				break;
			}	
		}
	System.out.println(hasSymbol);
	}

}
