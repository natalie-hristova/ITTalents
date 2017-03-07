package homework08;

import java.util.Scanner;

public class Task05 {
		/*Да се състави програма, чрез която се въвеждат 2 редици от знаци
	(думи).
	Ако в двете редици участва един и същи знак, да се изведе на екрана
	първата редица хоризонтално, а втората вертикално, така че да се
	пресичат в общия си знак.
	Ако редиците нямат общ знак да се изведе само уведомително
	съобщение.
	Пример :
	м
	а
	шапка
	и
	н
	а
		 * 
		 */

	public static void main(String[] args) {
		String firstWord = getText();
		String secondWord = getText();
		printCrosser(firstWord, secondWord);
	}

	static String getText() {
		System.out.println("Enter text :");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		return word;
	}

	static int[] getIndexesAtCommonLetter(String word1, String word2) {
		int [] indexes={-1,-1};
		;
		String shortWord = word1;
		String longWord = word2;
		if (word1.length() > word2.length()) {
			shortWord = word2;
			longWord = word1;
		}
		for (int i = 0; i < longWord.length(); i++) {
			if (shortWord.contains(longWord.substring(i, i + 1))) {
				indexes[0] = i;
				indexes[1] = shortWord.indexOf(longWord.charAt(i));
				return indexes;
			}
		}
		return indexes;
	}

	static void printCrosser(String word1, String word2) {
		int indexOfLongWord = getIndexesAtCommonLetter(word1, word2)[0];
		int indexOfShortWord=  getIndexesAtCommonLetter(word1, word2)[1];
		String shortWord = word1;
		String longWord = word2;
		if (word1.length() > word2.length()) {
			shortWord = word2;
			longWord = word1;
		}

		if (indexOfLongWord < 0) {
			System.out.println("No match letters!");
		} else {
			for (int i = 0; i < longWord.length(); i++) {
				if (indexOfLongWord == i) {
					System.out.println(shortWord);
				} else {
					for (int j = 0; j < indexOfShortWord; j++) {
						System.out.print(" ");
					}
					System.out.println(longWord.charAt(i));
				}
			}
		}
	}
	
}
