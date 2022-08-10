package examples.s06_iterator;

import examples.pets.*;

import java.util.Iterator;
import java.util.List;

import static net.mindview.util.Print.*;

public class SimpleIteration {
	private static final List<Pet> PETS = Pets.arrayList(12);

	public static void main(String[] args) {
		Iterator<Pet> it = PETS.iterator();
		while (it.hasNext()) {
			Pet p = it.next();
			printnb(p.id() + ": " + p + " ");
		}
		print();
		/* A simpler approach, when possible: */
		for (Pet pet : PETS)
			printnb(pet.id() + ": " + pet + " ");
		print();
		/* An Iterator can also remove elements: */
		it = PETS.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
		print("examples.pets = " + PETS);
	}
}