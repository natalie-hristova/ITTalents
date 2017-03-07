
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Library {

	private HashMap<Read.Type, HashMap<IGroup, TreeSet<Read>>> allRead;
	private ArrayList<Takeable> isTaken = new ArrayList();
	private TreeMap<Read, TreeMap<LocalTime, LocalTime>> archive;
	private boolean isInRevision = false;;

	Library() {
		allRead = new HashMap();
		allRead.put(Read.Type.BOOK, new HashMap<IGroup, TreeSet<Read>>());
		allRead.put(Read.Type.MAGAZINE, new HashMap<IGroup, TreeSet<Read>>());
		allRead.put(Read.Type.TEXTBOOK, new HashMap<IGroup, TreeSet<Read>>());

	}
	
	public void printAllRead(){
		for (Iterator<Entry<Read.Type, HashMap<IGroup, TreeSet<Read>>>> iterator = allRead.entrySet().iterator(); iterator.hasNext();) {
			Entry<Read.Type, HashMap<IGroup, TreeSet<Read>>> type = (Entry<Read.Type, HashMap<IGroup, TreeSet<Read>>>) iterator.next();
			System.out.println(" Type---"+ type.getKey());
			for (Iterator<Entry<IGroup, TreeSet<Read>>> iterator2 = type.getValue().entrySet().iterator(); iterator2.hasNext();) {
				Entry<IGroup, TreeSet<Read>> group = (Entry<IGroup, TreeSet<Read>>) iterator2.next();
				System.out.println("   Group---"+ group.getKey()+ "-----");
				for (Iterator<Read> iterator3 = group.getValue().iterator(); iterator3.hasNext();) {
					Read read = (Read) iterator3.next();
					System.out.println("     * "+ read);
					
				}
			}
		}
	}

	public Map getAllRead() {
		return Collections.unmodifiableMap(allRead);
	}

	public void addIsTaken(Read read) {
		if (read instanceof Takeable) {
			isTaken.add((Takeable) read);
		} else {
			System.out.println("This can not be taken");
		}
	}

	public void startsInRevision() {
		this.isInRevision = true;
	}

	public Set getAllNotInLibraryNow() {
		if (isInRevision) {
			HashSet<Read> inLibrary = new HashSet();
			for (Iterator<HashMap<IGroup, TreeSet<Read>>> iterator = allRead.values().iterator(); iterator.hasNext();) {
				HashMap<IGroup, TreeSet<Read>> read = (HashMap<IGroup, TreeSet<Read>>) iterator.next();
				for (Iterator<TreeSet<Read>> iterator2 = read.values().iterator(); iterator2.hasNext();) {
					TreeSet<Read> read2 = (TreeSet<Read>) iterator2.next();
					for (Iterator iterator3 = read2.iterator(); iterator3.hasNext();) {
						Read read3 = (Read) iterator3.next();
						if (!isTaken.contains(read2)) {
							inLibrary.add(read3);
						}

					}
				}
			}
			return Collections.unmodifiableSet(inLibrary);

		} else
			return null;
	}

	public void printAllInLibrary() {
		System.out.println(isTaken.size() + " are taken ");
		for (int i = 0; i < isTaken.size(); i++) {
			System.out.println(isTaken.get(i).getGetTime());
		}
	}

	public void addRead(Read read) {
		if (allRead.containsKey(read.getType())) {
		for (Iterator<Entry<Read.Type, HashMap<IGroup, TreeSet<Read>>>> iterator = allRead.entrySet().iterator(); iterator.hasNext();) {
			Entry<Read.Type, HashMap<IGroup, TreeSet<Read>>> takeable = (Entry<Read.Type, HashMap<IGroup, TreeSet<Read>>>) iterator.next();
			if (takeable.getKey()==(read.getType())) {
					if (takeable.getValue().containsKey(read.getIGroup())) {
				for (Iterator<Entry<IGroup, TreeSet<Read>>> iterator2 = takeable.getValue().entrySet().iterator(); iterator2.hasNext();) {
					Entry<IGroup, TreeSet<Read>> itr = (Entry<IGroup, TreeSet<Read>>) iterator2.next();
					if (itr.getKey()==(read.getIGroup())) {
						itr.getValue().add(read);
					}
				}
			}else
			{
			allRead.get(read.getType()).put(read.getIGroup(), new TreeSet<Read>());
			allRead.get(read.getType()).get(read.getIGroup()).add(read);
				}
			}
					
		}
		}
		else{
			allRead.put(read.getType(), new HashMap<IGroup, TreeSet<Read>>());
			allRead.get(read.getType()).put(read.getIGroup(), new TreeSet<Read>());
			allRead.get(read.getType()).get(read.getIGroup()).add(read);
		}
		
	}

}
