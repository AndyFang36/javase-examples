package examples.s04_printing;

import java.util.*;

import static net.mindview.util.Print.*;

public class PrintingContainers {
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}

	static Map fill(Map<String, String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}

	public static void main(String[] args) {
		print(fill(new ArrayList<>()));
		print(fill(new LinkedList<>()));
		print(fill(new HashSet<>()));
		print(fill(new TreeSet<>()));
		print(fill(new LinkedHashSet<>()));
		print(fill(new HashMap<>()));
		print(fill(new TreeMap<>()));
		print(fill(new LinkedHashMap<>()));
	}
}
