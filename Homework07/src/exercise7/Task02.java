package exercise7;

public class Task02 {
	/*
	 * ��������� ����� �������� �������, ��� ����� ������� �
������ � > �� ��������� � < �� ���������. ��������
��������, ����� ��������� ���� ����� ����� �� ����� �
�������.

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
