package exercise7;

public class Task11Part4 {
	/*
	 *  �� �� ������ �������� ����� ������� �� ����������� �� ������ 2 ����� n �
	 * m. ���� ���� �� �� ������� ������� � ������ n x m �� �������� �����
	 * (��������� �� ������ �� �������� n=4 � m=5):
	 * 1 8 9 16 17
		2 7 10 15 18
		3 6 11 14 19
		4 5 12 13 20

	 */
	public static void main(String[] args) {
//		System.out.println("Enter the number of rows and columns : ");
//		Scanner sc= new Scanner (System.in);
//		int n =sc.nextInt();
//		int m =sc.nextInt();

		int n = 4;
		int m = 5;
		int[][] array = new int[n][m];
		int number = 1;

		for (int i = 0; i < m; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					array[j][i] = number;
					number++;
				}
			}else{
					for (int j = n-1; j>=0; j--) {
						array[j][i]= number;
						number++;
					}
				}
			}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
