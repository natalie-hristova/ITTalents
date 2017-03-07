package homework1;

import java.util.Scanner;

public class Task10 {

	// Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
	// 3 литра и ги ползвате едновременно.
	// Да се състави програма, която по даден обем извежда как ще прелеете
	// течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
	// кофите. Кофите не могат да се ползват с частично количество вода.
	// Входни данни: естествено число от интервала [10..9999].
	// Пример: 107
	// Изход: 21 пъти по 2 литра,
	// 21 пъти по 3 литра
	// допълнително кофа от 2 литра

	public static void main(String[] args) {
		System.out.println("Enter the litres: ");
		Scanner sc = new Scanner(System.in);
		int litres = sc.nextInt();
		int fullBins = litres / 5;
		int remain = litres % 5;
		System.out.println(fullBins + " пъти по 2 литра." + "\n" + fullBins + " пъти по 3 литра.");
		if (remain == 3 || remain == 2) {
			System.out.printf("допълнително кофа от %d литра", remain);
		} else if (remain > 0) {
			System.out.printf("допълнително %d литра", remain);
		}
	}
}
