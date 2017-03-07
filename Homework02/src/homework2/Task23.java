package homework2;

public class Task23 {

	// Да се състави програма, която чрез цикъл while извежда
	// таблицата за умножение, но без повторение.
	// Т.е. ако е изведено 4*5 не се извежда 5*4.
	
	public static void main(String[] args) {
		int x = 1;

		while (x < 10) {
			int i = x;
			while (i < 10) {
				System.out.print(x + "*" + i + "; ");
				i++;
			}
			System.out.println();
			x++;
		}
	}
}
