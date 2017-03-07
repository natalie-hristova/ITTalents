import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Demo {
	public static void main(String[] args) throws Exception {
		Library lib = new Library();
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		               

		    LocalTime time1 = LocalTime.parse("13:37", formatter);
		    LocalTime time2 = LocalTime.parse("13:00", formatter);
		    LocalTime time3 = LocalTime.parse("01:34", formatter);
		    LocalTime time4 = LocalTime.parse("12:00", formatter);
		    LocalTime time5 = LocalTime.parse("19:20", formatter);
		Date date = new Date();
		Book b = new Book("Book1", "Pub1", Book.Genre.LoveRoman, time1);
		lib.addRead( b);
		lib.addRead( new Book("Book2", "Pub1", Book.Genre.LoveRoman, time3));
		lib.addRead( new Magazine("magazin1", "cf",Magazine.Category.Nature, date));
		lib.addRead( new TextBook("TextBook1", "Pub1", TextBook.Theme.MATHS));
		lib.addRead( new Book("Book1", "Pub1", Book.Genre.LoveRoman, time1));
		lib.addRead( new Book("Book1", "Pub1", Book.Genre.LoveRoman, time1));
	    lib.printAllRead();
	    Person p = new Person("sad");
	   
	}

}
