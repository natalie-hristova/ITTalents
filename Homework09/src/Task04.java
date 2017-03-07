import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Task04 {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� ������� � ������ ����� ��
	 * �������� �� ����� ��� ��� �������� ���������������� (���������� ��
	 * �����):
	 *  ������: 1, 9
	 *   �����: 1
	 *   		 1 2
	 *   		 1 2 3
	 *   		 ...
	 *   	 �� 1 2 3 4 5 6 7 8 9
	 * ����������� ��������
	 */
	public static void main(String[] args) {
		int start = 4;
		int end = 9;
		makeTriangleFromNumbers(start, end,start);
	}


	static void iterateOneRow(int start,int end){
		for (int i = start; i <=end; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static int makeTriangleFromNumbers(int start,int end,int x){
		if (x ==end) {
			iterateOneRow(start,x);
			return 1;
		}
		iterateOneRow(start,x);
		return (makeTriangleFromNumbers(start,end,x+1));
	}
}
