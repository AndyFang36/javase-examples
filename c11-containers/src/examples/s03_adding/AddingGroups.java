package examples.s03_adding;

import java.util.*;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
		Integer[] moreInts = {5, 6, 7, 8, 9};
		c.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can’t
		// construct a Collection this way:
		Collections.addAll(c, 10, 11, 12, 13, 14);
		Collections.addAll(c, moreInts);
		// Produces a list "backed by" an array:
		List<Integer> list = Arrays.asList(15, 16, 17, 18, 19);
		list.set(1, 99); // OK -- modify an element
		// Runtime error, because the
		// underlying array cannot be resized:
		//! list.add(20);
		for (Integer temp : c) {
			System.out.print(temp + " ");
		}
		System.out.println();
		for (Integer temp : list) {
			System.out.print(temp + " ");
		}
	}
}
