package homework2;

public class Task12 {

	// Да се състави програма, която извежда всички
	// естествени трицифрени числа, които нямат еднакви цифри т.е.
	// 100,101, 606 и т.н. не се извеждат.
	public static void main(String[] args) {
		for (int i = 100; i < 999; i++) {

			int unit = i % 10;
			int hundred = i / 100;
			int ten = i / 10 % 10;

			if (unit != ten && ten != hundred && unit != hundred) {
				System.out.println(i);
			}
		}
	}
}
