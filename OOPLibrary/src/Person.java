import java.time.Duration;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.Map;

public class Person {
	private String name;

	private Library library;


	public Person(String name) {
		this.name = name;
	}

	public void getRead(Read read) throws Exception {
		read.addGetTime(LocalTime.now());
		library.addIsTaken(read);

	}

	public double returnReadTax(Takeable read,LocalTime time){
		Map<LocalTime,LocalTime> map= read.getGetReturn();
		if (map.containsKey(read)) {
			for (Iterator iterator = map.values().iterator(); iterator.hasNext();) {
				LocalTime timeToReturn = (LocalTime) iterator.next();
				if (timeToReturn.isAfter(time)) {
					System.out.println("No tax");
					return 0;
				}else{
					double d = time.compareTo(timeToReturn);
					double tax = (double)d*read.getTax()/100;
					System.out.println("Tax is : " + tax);
					return tax;
				}
			}
		}else{
			System.out.println("The book is not from here ");
		}
		return 0;
	}
	
	public double returnBook(Takeable read){
		double tax = returnReadTax( read,LocalTime.now());
		return tax + read.getTax();
	}
	
	
}
