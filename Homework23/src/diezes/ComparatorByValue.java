package diezes;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorByValue implements Comparator<Map.Entry<Character, Integer>> {

	@Override
	public int compare(Entry<Character, Integer> ci1, Entry<Character, Integer> ci2) {
		if (ci1.getValue() != null && ci2.getValue() != null) {
			return ci2.getValue() - ci1.getValue();
		}
		return 0;
	}

}
