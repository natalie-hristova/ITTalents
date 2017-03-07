import java.time.Duration;
import java.time.LocalTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TextBook extends Read implements Comparable<TextBook>,Takeable{
	
	private String autor;
	enum Theme implements IGroup{
		HISTORY,GEOGRAPHY,MATHS
	}
	private Theme theme;
	private static final int TAX_TEXTBOOK=3;
	private static final Duration SECONDS_TO_KEEP_TEXTBOOK = Duration.ofSeconds(150); 
	 private TreeMap<LocalTime,LocalTime> getReturn;
	public TextBook(String name, String publisher, IGroup theme) {
		super(name, publisher, Read.Type.TEXTBOOK, theme,TAX_TEXTBOOK);
	}


	@Override
	public int compareTo(TextBook o) {
		return this.name.compareTo(o.getName());
	}

	private String getName() {
		return this.name;
	}

	@Override
	public void addGetTime(LocalTime date) {
		getReturn.put(date, date.plus(SECONDS_TO_KEEP_TEXTBOOK));
		
	}
	@Override
	public Map getGetReturn() {

		return Collections.unmodifiableMap(getReturn);
	}
	@Override
	
	public Set getGetTime() {
		HashSet<LocalTime> x = (HashSet<LocalTime>) getReturn.keySet();
		return Collections.unmodifiableSet(x);
	}


	@Override
	public int getTax() {
		return TAX_TEXTBOOK;
	}
}

