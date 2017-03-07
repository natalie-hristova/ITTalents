package homework1;

import java.util.Scanner;
import javax.xml.transform.Templates;

public class Task13 {
	// Да се състави програма, която да отгатне колко е студено/топло по
	// въведената температура t в градус Целзий.
	// Температурните интервали са:
	// под -20 ледено студено;
	// между 0 и -20 - студено;
	// между 15 и 0 - хладно;
	// между 25 и 15 - топло;
	// над 25 – горещо.
	// Входни данни: цяло число от интервала [-100..100].
	// Пример: 12
	// Изход: хладно
	
	public static void main(String[] args) {
		System.out.println("Enter the temperature in Celsius : ");
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();
		if (temperature < -100 || temperature > 100) {
			System.out.println("Please, enter valid data");
		} else {
			if (temperature <= -20) {
				System.out.println("ледено студено");
			} else if (temperature < 0) {
				System.out.println("студено");
			} else if (temperature <= 15) {
				System.out.println("хладно");
			} else if (temperature <= 25) {
				System.out.println("топло");
			} else {
				System.out.println("горещо");
			}
		}
	}
}
