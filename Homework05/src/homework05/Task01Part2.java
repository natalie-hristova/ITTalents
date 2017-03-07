package homework05;

public class Task01Part2 {
	/**
	 * �� �� ������� ����� � �� �� ������ ���-������� ����� ������ �� 3 ��
	 * ������. 10, 3, 5, 8, 6, -3, 7 ���-������� ����� ������ �� 3 � -3
	 */
	public static void main(String[] args) {
		int[] array = { 10, 3, 5, 8, 6, -3, 7 };
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("No such element!");
		} else {
			int[] newArray = new int[count];
			int j = 0;

			for (int i = 0; i < array.length; i++) {
				if (array[i] % 3 == 0) {
					newArray[j] = array[i];
					j++;
				}
			}

			int min = newArray[0];

			for (int i = 1; i < newArray.length; i++) {
				if (min > newArray[i]) {
					min = newArray[i];
				}
			}

			System.out.println("The min number devided by 3 is :" + min);
		}
	}
}
