package examples.s13_foreach;

import java.util.Arrays;

public class ArrayIsNoIterable {
	private static <T> void test(Iterable<T> ib) {
		for (T t : ib)
			System.out.print(t + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		test(Arrays.asList(1, 2, 3));
		String[] str = {"A", "B", "C"};
		// An array works in foreach, but it’s not Iterable:
		//! test(str);
		// You must explicitly convert it to an Iterable:
		test(Arrays.asList(str));
	}
}
