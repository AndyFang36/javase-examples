package examples.s13_foreach._01_adapter;

import static net.mindview.util.Print.*;

import java.util.*;

public class ModifyingArraysAsList {
	private static final Random rand = new Random(47);
	private static final Integer[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(
			Arrays.asList(ints)
		);
		print("Before shuffling:\n" + list1);
		Collections.shuffle(list1, rand);
		print("After shuffling:\n" + list1);
		print("ints:\n" + Arrays.toString(ints));
		//
		List<Integer> list2 = Arrays.asList(ints);
		print("Before shuffling:\n" + list2);
		Collections.shuffle(list2, rand);
		print("After shuffling:\n" + list2);
		print("ints:\n" + Arrays.toString(ints));
	}
}
