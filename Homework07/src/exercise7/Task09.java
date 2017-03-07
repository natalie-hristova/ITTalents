package exercise7;

public class Task09 {
	/*
	 * Дадена е правоъ­гълна матрица с числа. Да се намери в нея
максималната подмат­рица с размер 2 х 2 и да се отпечата на
конзолата. Под максимална подматрица се разбира
подматрица, която има максимална сума на елементите, които я
съставят
	 */
	
	public static void main(String[] args) {
		int [][] array = {
				{1,2,3,4,3},
				{5,6,7,8,5},
				{9,10,11,12,55},
				{13,14,15,16,5},	
		};
		int sum =0;
		int maxSum =array[0][0]+array[0][1]+array[1][1]+array[1][0];
		int indexI=0;
		int indexJ = 0;
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				sum =array[i][j]+array[i][j+1]+array[i+1][j+1]+array[i+1][j];
				if (maxSum<sum) {
					maxSum= sum;
					indexI = i;
					indexJ = j;
				}
				sum=0;
			}
		}
		System.out.println("The max sum is : "+maxSum);
		System.out.println(array[indexI][indexJ]+ " "+array[indexI][indexJ+1]);
		System.out.println(array[indexI+1][indexJ]+ " "+array[indexI+1][indexJ+1]);
	}

}
