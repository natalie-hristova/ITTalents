package homework08;
/*
 * Да се създаде метод, който отпечатва масив в конзолата.
 */
public class Task11 {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9};
		printArray(array);
	}
	
	static void printArray(int[] array){
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i==array.length-1) {
				System.out.print(array[i]);
			}else{
				System.out.print(array[i]+ ", ");
			}
		}
		System.out.println("]");
	}
}
