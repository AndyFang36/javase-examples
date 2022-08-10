package exercises.ex11;

import exercises.ex04.MovieNameGenerator;

import java.util.*;

public class IterationToString {
	public static void printToStrings(Iterator<?> it) {
		while (it.hasNext())
			System.out.println(it.next().toString());
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Collection<String>> ca = Arrays.asList(
			new ArrayList<>(),
			new LinkedList<>(),
			new HashSet<>(),
			new TreeSet<>()
		);
		for (Collection<String> c : ca)
			MovieNameGenerator.fill(c);
		for (Collection<String> c : ca)
			printToStrings(c.iterator());
	}
}
