import java.time.LocalTime;
import java.util.Date;

public class Magazine extends Read implements Comparable<Magazine>{

	enum Category implements IGroup{
		Nature,Science
	}
	private Category category;
	private int number;
	private Date issueDate;
	
	public Magazine(String name, String publisher, IGroup category,Date issueDate) {
		super(name, publisher, Read.Type.MAGAZINE, category,0);
		this.issueDate= issueDate;
	}
	@Override
	public int compareTo(Magazine o) {
		if (this.name.compareTo(o.getName())==0) {
			return (this.number-o.number);
		}
		return this.name.compareTo(o.getName());
	}
	private String getName() {
		return this.name;
	}
	private Category getCategory() {
		return category;
	}
	@Override
	public void addGetTime(LocalTime date) throws Exception {
		throw new Exception("Magazines can NOT be taken!");
	//	System.out.println("Magazines can NOT be taken!");
	// tuk trqbva da ima exception koito se hvyrlq
	}

	
}
