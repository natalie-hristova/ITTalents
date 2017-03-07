package exercise7;

public class Task02 {
	/*
	 * Едномерен масив наричаме назъбен, ако всеки елемент в
масива е > от предишния и < от следващия. Напишете
програма, която проверява дали даден масив от числа е
назъбен.

	 */
	
	public static void main(String[] args) {
		int [] array = {7,1,3,2,6,4,73,3,2};
		boolean isZigZag = true;
		
		for (int i = 1; i < array.length-1; i++) {
			if(!((array[i]>array[i-1]&& array[i]>array[i+1])||(array[i]<array[i-1]&& array[i]<array[i+1]))){
			isZigZag =false ;
			break;
			}
		}
		System.out.println(isZigZag);
	}

}
