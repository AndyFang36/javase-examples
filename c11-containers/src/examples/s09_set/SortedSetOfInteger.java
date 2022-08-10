package examples.s09_set;

import java.util.*;

public class SortedSetOfInteger {
	private static final Random r = new Random(47);

	public static void main(String[] args) {
		SortedSet<Integer> ints = new TreeSet<>();
		for (int i = 0; i < 1000; i++) {
			ints.add(r.nextInt(20));
		}
		System.out.println(ints);
	}
}
