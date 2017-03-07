
public class Task05 {
	
	/*
	 * Да се състави програма, чрез която се въвежда естествено число N.
	 * Програмата да извежда число, чиито цифри са написани в ред обратен на
	 * въведеното число. Да се извежда съобщение дали въведеното число е
	 * палиндром. 
	 * Пример: 12321 
	 * Изход: 12321 да.
	 *  Пример: 12578 
	 *  Изход: 87521 не.
	 * Използвайте рекурсия
	 */
	public static void main(String[] args) {
		// i is CONST!
		int i = 0;
		int x = 12321;
		String[] array = arrayMethod(x);
		printArrayAsNumber(convert2(x, array, i));
	}

	static String[] arrayMethod(int number) {
		String text = Integer.toString(number);
		String[] array = new String[text.length() + 1];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = text.substring(i, i + 1);
		}
		array[array.length - 1] = " is palindrome.";
		return array;
	}

	static int multiplier(int xTens) {
		int multiplier = 1;
		for (int i = 1; i < xTens; i++) {
			multiplier *= 10;
		}
		return multiplier;
	}

	static void printArrayAsNumber(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	static String[] convert2(int x, String[] array, int i) {
		int numberOfNumbers = Integer.toString(x).length();
		if (i >= numberOfNumbers - 1) {
			return array;
		}
		int lastNumber = x % 10;
		int firstNumber = x / multiplier(numberOfNumbers);
		int middle = (x % (multiplier(numberOfNumbers))) / 10;
		array[i] = Integer.toString(lastNumber);
		array[array.length - 2 - i] = Integer.toString(firstNumber);
		if (numberOfNumbers <= 1) {
			return convert2(middle, array, i + 1);
		}
		if (lastNumber != firstNumber) {
			array[array.length - 1] = " is Not palindrome.";
		}
		return convert2(middle, array, i + 1);
	}

}
