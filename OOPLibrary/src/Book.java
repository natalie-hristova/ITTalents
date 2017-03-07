
import java.time.*;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Book extends Read implements Comparable<Book>, Takeable {

	public enum Genre implements IGroup {
		LoveRoman, Thriller;
	}

	private Genre genre;
	private String author;
	private LocalTime time;
	private static final Duration SECONDS_TO_KEEP_BOOK = Duration.ofSeconds(300);
	private static final int TAX_BOOK = 2;

	private TreeMap<LocalTime, LocalTime> getReturn;

	public Book(String name, String publisher, IGroup genre, LocalTime time) {
		super(name, publisher, Read.Type.BOOK, genre, TAX_BOOK);
		this.time = time;
	}

	@Override
	public int compareTo(Book b) {
		return b.time.compareTo(this.getTime());
	}

	private Genre getGenre() {
		return genre;
	}

	private LocalTime getTime() {
		return this.time;
	}

	@Override
	public void addGetTime(LocalTime date) {
		getReturn.put(date, date.plus(SECONDS_TO_KEEP_BOOK));

	}

	@Override
	public Set getGetTime() {
		HashSet<LocalTime> x = (HashSet<LocalTime>) getReturn.keySet();
		return Collections.unmodifiableSet(x);
	}

	@Override
	public Map getGetReturn() {

		return Collections.unmodifiableMap(getReturn);
	}
	@Override
	public int getTax() {
		return TAX_BOOK;
	}

}
