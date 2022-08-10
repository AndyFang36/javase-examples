package exercises.ex07;

import java.util.*;

import static net.mindview.util.Print.*;

public class ListTest {
	private static final IDClass[] idc = new IDClass[10];

	public static void main(String[] args) {
		for (int i = 0; i < idc.length; i++)
			idc[i] = new IDClass();
		List<IDClass> myList = new ArrayList<>(
			Arrays.asList(idc)
		);
		print("myList = " + myList);
		List<IDClass> subSet = myList.subList(
			myList.size() / 4, myList.size() / 2
		);
		print("subSet = " + subSet);
		// The semantics of the sub list become undefined if the
		// backing list is structurally modified!
		//! myList.removeAll(subSet);
		subSet.clear();
		print("myList = " + myList);
	}
}
