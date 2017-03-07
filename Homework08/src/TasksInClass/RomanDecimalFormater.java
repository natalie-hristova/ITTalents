package TasksInClass;

public class RomanDecimalFormater {
	// Write a function to convert Roman Number in Decimal Format

	public static void main(String[] args) {
		int x =fromRomanToDecimal("xl");
	}
	
	static boolean checkText(String text){
		String upper= text.toUpperCase();
		String symbols = "IVXLCMD";
			for (int i = 0; i< text.length(); i++) {
				//check if a char from the given text is not correct
				if (!(symbols.contains(upper.substring(i,i+1)))) {
					return false;
				}
			}
		return true;
	}
	
	static int fromRomanToDecimal(String givenText) {
		if (!checkText(givenText)) {
			System.out.println("Not valid data");
			return 0;
		}
		String text= givenText.toUpperCase();
		int number = 0;
		int oldNumber=0;
		int sum=0;
		for (int i = text.length()-1; i >=0; i--) {
			char currentSymbol = text.charAt(i);
			oldNumber=number;
			switch (currentSymbol) {
			case 'I':
				number=1;
				break;
			case 'X':
				number = 10;
				break;
			case 'V':
				number = 5;
				break;
			case 'L':
				number = 50;
				break;
			case 'C':
				number = 100;
				break;
			case 'D':
				number = 500;
				break;
			case 'M':
				number = 1_000;
				break;
			}
			if(oldNumber>number){
				sum-=number;
			}else{
				sum+=number;
			}
		}
		System.out.println(sum);
		return sum;
	}
}
