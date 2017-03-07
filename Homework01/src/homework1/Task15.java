package homework1;

import java.util.Scanner;

public class Task15 {

//	Да се състави програма, която въвежда естествено число от интервала
//	[0..24].
//	Програмата да изведе съответстващо съобщение съобразно въведения
//	час.
//	Периодите са:
//	[18..4] - Добър вечер;
//	[4..9] - Добро утро;
//	[9..18] - Добър ден
//	Пример: 10
//	Изход: Добър ден
	
	public static void main(String[] args) {
		System.out.println("Въведете естествено число от интервала [0,24] : ");
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		if (number >24 || number <0) {
			System.out.println("Числото Ви НЕ е валидно!");
		}else if(number>18 || number <= 4){
			System.out.println("Добър вечер");
		}else if (number >4 && number <= 9 ){
			System.out.println("Добро утро");
		}else {
			System.out.println("Добър ден");
		}
		
	}

	
}
