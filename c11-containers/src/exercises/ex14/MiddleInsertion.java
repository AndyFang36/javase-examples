package exercises.ex14;

import java.util.*;

public class MiddleInsertion {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		ListIterator<Integer> it = list.listIterator();
		for (int i = 1; i <= 10; i++) {
			it.add(i);
			if (i % 2 == 0)
				it.previous();
		}
		System.out.println(list);
	}
}
