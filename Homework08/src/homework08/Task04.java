package homework08;

import java.util.Scanner;

public class Task04 {
	/*
	 * Да се състави програма, чрез която по въведени трите имена на двама
	 * човека разделени със запетая, се извежда чие име има по-голям сбор от
	 * ASCII кодовете на съставящите името букви. Пример: Anna Dosewa Asenowa,
	 * Iwo Peew Peew Изход: Anna Dosewa Asenowa
	 * 
	 */

	public static void main(String[] args) {
		String [] names = getNames();
		String greaterName = greaterASCIISum(names);
		System.out.println(greaterName);
		
	}
	
	static String [] getNames(){
		Scanner sc= new Scanner(System.in);
		String[] names =new String [6];
		System.out.println("Please enter 2 names devided by \", \"");
		for (int i = 0; i < names.length; i++) {
			names[i]= sc.next();
		}
		if (names[2].endsWith(",")) {
			names[2]=names[2].replace(",","");
		}
		return names;
	}
	
	static String greaterASCIISum(String [] names){
		StringBuilder fName = new StringBuilder( names[0]+ " "+names[1] + " "+names[2]);
		StringBuilder sName = new StringBuilder( names[3]+ " "+names[4] + " "+names[5]);
		long sumOfFName = 0;
		long sumOfSName=0;
		for (int i = 0; i <fName.length(); i++) {
			sumOfFName += fName.charAt(i);
		}
		for (int i = 0; i < sName.length(); i++) {
			sumOfSName += sName.charAt(i);
		}
		if (sumOfFName>sumOfSName) {
			return fName.toString();
		}else if(sumOfFName<sumOfSName){
			return sName.toString();
		}else{
			return "The names have the same sum !";
		}	
	}
}
