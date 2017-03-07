package exercise7;

public class Task11Part2 {

	/*
	 *  Да се напише програма която изисква от потребителя да въведе 2 числа n и
	 * m. След това да се построи матрица с размер n x m по следният начин
	 * (примерите са дадени за въведени n=4 и m=5):
	 * 1,5,9,13,17,
	 * 2,6,10,14,18,
	 * 3,7,11,15,19,
	 * 4,8,12,16,20
	 */
	public static void main(String[] args) {
//		System.out.println("Enter the number of rows and columns : ");
//		Scanner sc= new Scanner (System.in);
//		int n =sc.nextInt();
//		int m =sc.nextInt();

		int n=4;
		int m=5;
		int number = 1;
		int[][] array = new int [n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[j][i]=number;
				number ++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array [i][j] + " ");
			}
			System.out.println();
		}
	}
}
