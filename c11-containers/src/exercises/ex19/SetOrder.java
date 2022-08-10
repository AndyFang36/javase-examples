package exercises.ex19;

import net.mindview.util.Countries;

import java.util.*;

public class SetOrder {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>(
			Countries.names(25)
		);
		System.out.println(s1);
		String[] elements = s1.toArray(new String[0]);
		Arrays.sort(elements);
		Set<String> s2 = new LinkedHashSet<>();
		Collections.addAll(s2, elements);
		System.out.println(s2);
	}
}
