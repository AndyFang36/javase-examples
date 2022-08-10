package exercises.ex12;

import java.util.*;

import static net.mindview.util.Print.*;

public class ListIteration {
	static void reverse(List<Integer> list) {
		ListIterator<Integer> fwd = list.listIterator();
		ListIterator<Integer> rev = list.listIterator(list.size());
		int mid = list.size() >> 1;
		for (int i = 0; i < mid; i++) {
			Integer tmp = fwd.next();
			fwd.set(rev.previous());
			rev.set(tmp);
		}
	}

	public static void main(String[] args) {
		List<Integer> src = Arrays.asList(
			0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		);
		List<Integer> dest = new LinkedList<>(src);
		print("source: " + src);
		print("destination: " + dest);
		reverse(dest);
		print("destination: " + dest);
	}
}
