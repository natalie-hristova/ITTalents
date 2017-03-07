package exercise7;

public class Task11Part3 {
	
	/*
	 *  Да се напише програма която изисква от потребителя да въведе 2 числа n и
	 * m. След това да се построи матрица с размер n x m по следният начин
	 * (примерите са дадени за въведени n=4 и m=5):
	 * 1 3 6 10 14
		2 5 9 13 17
		4 8 12 16 19
		7 11 15 18 20

	 */
	public static void main(String[] args) {
//		System.out.println("Enter the number of rows and columns : ");
//		Scanner sc= new Scanner (System.in);
//		int n =sc.nextInt();
//		int m =sc.nextInt();
		
		int n =4;
		int m =5;
		int number = 1;
		int[][] array= new int [n][m];
		int ch=0;
		
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n - i&& j<m; j++) {
				array[i ][j+i] = ch++;
				//System.out.println(i + " " + j);
			}

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print (array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
