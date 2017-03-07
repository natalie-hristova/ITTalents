package exercise7;
import java.util.Scanner;
public class Tsda{


		public static void main(String[] args) {
			System.out.println("Enter n:");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			System.out.println("Enter m:");
			int m = input.nextInt();
			int [][]arr = new int[n][m];
			int ch = 1;
			for (int i = n - 1; i >= 0; i--) {
				for (int j = 0; j < n - i&& j<m; j++) {
					arr[i + j][j] = ch++;
				}

			}
			for (int i = m - 1; i >0; i--) {
				for (int j = 0; j < i && j<n; j++) {

					arr[j][j + m - i] = ch++;
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++)
					System.out.print(arr[i][j] + " ");

				System.out.println();
			}
		}
	}

