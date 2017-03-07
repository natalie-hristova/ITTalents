package diezes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CommonLetters {

	public static final double MAX_NUMBER_OF_DIEZES = 20;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sentence:");
		String text = sc.nextLine();

		TreeMap<Character, Integer> collection = new TreeMap();
		ArrayList<Integer> intList = new ArrayList<>();
		LinkedList<Character> charList = new LinkedList<>();
		char[] array = text.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (isCharValid(array[i])) {
				char current = toUpper(array[i]);
				if (collection.containsKey(current)) {
					collection.put(current, collection.get(current) + 1);
				} else {
					collection.put(current, 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : collection.entrySet()) {
			intList.add(entry.getValue());
		}
		Collections.sort(intList);
		Collections.reverse(intList);
		double coeficient = (double) ((double) MAX_NUMBER_OF_DIEZES / intList.get(0));
		System.out.println(coeficient);

		for (int i = 0; i < intList.size(); i++) {
			for (Iterator<Entry<Character, Integer>> it = collection.entrySet().iterator(); it.hasNext();) {
				Map.Entry<Character, Integer> current = (Entry<Character, Integer>) it.next();
				if (current.getValue() == intList.get(i)) {
					if (!charList.contains(current.getKey())) {
						charList.add(current.getKey());
					}
				}
			}
		}

		System.out.println(intList + " " + charList);
		for (int i = 0; i < charList.size(); i++) {
			System.out.print(charList.get(i) + ": " + intList.get(i) + " ");
			for (int j = 0; j < intList.get(i) * coeficient; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	private static boolean isCharValid(char symbol) {
		return (symbol >= 'A' && symbol <= 'z');
	}

	private static char toUpper(char symbol) {
		if (symbol >= 'A' && symbol <= 'Z') {
			return symbol;
		} else {
			return (char) (symbol - 32);
		}
	}
}
