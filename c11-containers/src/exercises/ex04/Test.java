package exercises.ex04;

import java.util.*;

import static net.mindview.util.Print.*;

public class Test {
	private static final MovieNameGenerator mng = new MovieNameGenerator();

	static String[] fill(String[] array) {
		for (int i = 0; i < array.length; i++)
			array[i] = mng.next();
		return array;
	}

	static Collection<String> fill(Collection<String> collection) {
		for (int i = 0; i < 5; i++)
			collection.add(mng.next());
		return collection;
	}

	public static void main(String[] args) {
		String[] s = fill(new String[5]);
		print(Arrays.toString(s));
		print(fill(new ArrayList<>()));
		print(fill(new LinkedList<>()));
		print(fill(new HashSet<>()));
		print(fill(new LinkedHashSet<>()));
		print(fill(new TreeSet<>()));
	}
}
