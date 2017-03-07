package homework2;

public class Task20 {

	// Да се състави програма, чрез която се извежда квадрат от
	// цифри. Сумите от елементите на произволен ред или стълб са
	// равни на 45.

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1 + count; i <= 9; i++) {
			System.out.print(i + " ");
			for (int j = i + 1; j < 10; j++) {
				System.out.print(j + " ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			count++;
			System.out.println();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

	}
}
