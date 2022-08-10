package examples.s06_iterator.c11_06_1;

import examples.pets.*;

import java.util.*;

import static net.mindview.util.Print.*;

public class ListIteration {
	private static final List<Pet> pets = Pets.arrayList(8);

	public static void main(String[] args) {
		ListIterator<Pet> it = pets.listIterator();
		while (it.hasNext())
			printnb(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
		print();
		// Backwards:
		while (it.hasPrevious())
			printnb(it.previous().id() + " ");
		print();
		print(pets);
		it = pets.listIterator(3);
		while (it.hasNext()) {
			it.next();
			it.set(Pets.randomPet());
		}
		print(pets);
	}
}
