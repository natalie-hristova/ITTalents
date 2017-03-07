import java.time.LocalDate;
import java.time.LocalTime;
import java.util.TreeMap;



public abstract class Read {

	protected String name;
	private String publisher;

	enum Type {
		BOOK, MAGAZINE, TEXTBOOK
	}

	private Type type;
	private IGroup group;
	private int tax;
	public Object getGetReturn;

	public Read(String name, String publisher, Type type, IGroup group, int tax) {
		this.name = name;
		this.publisher = publisher;
		this.type = type;
		this.group = group;
		this.tax = tax;
	}

	public abstract void addGetTime(LocalTime date) throws Exception;

	public Type getType() {
		return this.type;
	}
	
	public IGroup getIGroup(){
		return this.group;
	}

	@Override
	public String toString() {
		return name;
	}
}
