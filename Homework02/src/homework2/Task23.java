package homework2;

public class Task23 {

	// �� �� ������� ��������, ����� ���� ����� while �������
	// ��������� �� ���������, �� ��� ����������.
	// �.�. ��� � �������� 4*5 �� �� ������� 5*4.
	
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
