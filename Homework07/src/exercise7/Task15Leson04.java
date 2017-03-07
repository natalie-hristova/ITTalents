package exercise7;

import java.util.Scanner;

public class Task15Leson04 {
	/*
	 * Задача 15: Да се състави програма, която въвежда в едномерен масив реални
	 * числа. Като изход: програма извежда онези 3 различни числа, чиято
	 * абсолютна стойност формира максималната обща сума. Пример: 7.13; 0.2;
	 * 4.9;
	 */

	public static void main(String[] args) {
		 int [] array = {1,-3,4,-44,89,-7};
//		 System.out.println("Enter the length of the array");
//		 Scanner sc = new Scanner (System.in);
//		 int size = sc .nextInt();
//		
//		 
//		 while(size <= 0){
//			 System.out.println("Invalid data.Please , enter positive number!");
//			 size= sc.nextInt();
//		 }
		 
//		 int[] array = new int [size]; 
//		 
//		 for (int i = 0; i < array.length; i++) {
//			System.out.println("Enter the element at position"+ (i+1));
//			array[i]=sc.nextInt();
//		}
		 
		 int max1 =array[0];
		 int max2=array[0];
		 int max3 =array[0];
		 int maxIndex1 =0;
		 int maxIndex2=0;
		 int maxIndex3 =0;
		 int[] positiveArray= new int[array.length];
		 
		 for (int i = 0; i < positiveArray.length; i++) {
			if (array[i]<0) {
				positiveArray[i] = -array[i];
			}else{
				positiveArray[i] = array[i];
			}
		}
		 
		 for (int i = 0; i < positiveArray.length; i++) {
			if(max1<positiveArray[i]){
				max1= positiveArray[i];
				maxIndex1 =i;
			}
		}
		 
		 for (int i = 0; i < positiveArray.length; i++) {
			 if(max2<positiveArray[i] && positiveArray[i]<max1){
					max2= positiveArray[i];
					maxIndex2=i;
			}
		}
		 
		 for (int i = 0; i < positiveArray.length; i++) {
			 if(max3<positiveArray[i] && positiveArray[i]<max2){
					max3= positiveArray[i];
					maxIndex3=i;
			}
		}
		 
		 System.out.print(array[maxIndex1] +", " + array[maxIndex2] + ", "+array[maxIndex3]);
	}

}
