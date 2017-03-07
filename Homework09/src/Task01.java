
public class Task01 {
	/*
	 * �� �� ������� ��������, ����� ��������� N-���� ����� �� ��������. �������
	 * � ������� ����� �� �������� �� 1-��, ����� �������� � ����� �� ����� ��
	 * ����������� 2. 
	 * ������: 8 
	 * �����: 21 ������� 5 ����� �� �������� �� : 1, 1,2, 3, 5, 8, 13, 21
	 */

	public static void main(String[] args) {
		int n = 7;
		System.out.print("������� " + n + " ����� �� �������� �� : ");
		fibonacci(n, new StringBuilder());

		System.out.println();
		// System.out.println(s);
	}

	static int fibonacci(int n, StringBuilder a) {
		if (n == 1) {
			if (!a.toString().contains("1")) {
				a.append("1");
				System.out.print("1");
			}
			return 1;
		}
		if (n == 2) {
			if (!a.toString().contains("1, 1")) {
				a.append("1, 1");
				System.out.print("1, 1");
			}
			return 1;
		}
		if (!(a.toString().contains(Integer.toString(fibonacci(n - 1, a) + fibonacci(n - 2, a))))) {
			a.append(", " + (Integer.toString(fibonacci(n - 1, a) + fibonacci(n - 2, a))));
			System.out.print(", " + (Integer.toString(fibonacci(n - 1, a) + fibonacci(n - 2, a))));
		}

		return (fibonacci(n - 1, a) + fibonacci(n - 2, a));
	}

}