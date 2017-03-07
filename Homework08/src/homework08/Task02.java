package homework08;

import java.util.Scanner;

public class Task02 {
	/*
	 * Да се състави програма, чрез която от клавиатурата се въвеждат
	 * последователно две думи с дължина 10-20 знака. Програмата да размени
	 * първите им 5 знака и да изведе дължината на по-дългата, както и новото им
	 * съдържание. 
	 * Пример: uchilishe uchenik 
	 * Изход: 9 uchenishe
	 */


	public static void main(String[] args) {
		String firstString= validString();
		String secondString=validString();
		System.out.println(stringMixer(firstString, secondString));
	}
	
	static String validString(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text : ");
		String text =sc.nextLine();
		while(text.length() >= 20 || text.length()<=10){
			System.out.println("Enter valid data :");
			text = sc.nextLine();
		}
		return text;
	}
	

	static String stringMixer(String string1, String string2){
		String shortString = string2;
		String longString = string1;
		if (string1.length()>string2.length()) {
			System.out.print( string1.length()+" ");	
		}else if(string1.length()<string2.length()){
			 shortString = string1;
			 longString = string2;
			System.out.print( string2.length()+" ");
		}else{
			System.out.print("The sizes are equal- ");
			System.out.print( string1.length() +" ");
		}
		String result=shortString.substring(0, 5) + longString.substring(5);
		return result;
		
	}
}
