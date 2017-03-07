package exercise7;

public class Task05 {
	/*
	 * Напишете програма, която за дадена матрица m x n от числа
намира реда, в който сумата от елементите е максимална.
	 */
	public static void main(String[] args) {
		int [][] array = {
				{1,2,3,4,5},
				{5,6,7,8,5},
				{9,10,11,12,5},
				{13,14,15,16,5},
		};
		 int sumOfRow = 0;
		 int maxSum =0;
		 int index=0;
		 
		 for (int i = 0; i < array[0].length; i++) {
			maxSum +=array[0][i] ;
		}
		
		 for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumOfRow += array[i][j];
			}
			if (sumOfRow>maxSum) {
				maxSum =sumOfRow;
				index = i;
			}
			sumOfRow=0;
		}
		 
		 System.out.println("Max sum at row " + (index+1) + " and it is " + maxSum);
	}

}
