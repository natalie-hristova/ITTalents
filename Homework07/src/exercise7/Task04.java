package exercise7;

public class Task04 {
	/*
	 * Напишете програма, която сортира (подрежда елементите във
възходящ ред) масив, съдържащ само 0 и 1.

	 */

	public static void main(String[] args) {
		int[] arr = {0,1,0,0,0,0,1,1};
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				counter ++;
				arr[i]=1;
			}
		}
		for (int i = 0; i < counter; i++) {
			arr[i]=0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+ " ");
		}
	}
}
