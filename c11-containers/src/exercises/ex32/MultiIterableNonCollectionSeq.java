package exercises.ex32;

import static net.mindview.util.Print.*;

import examples.pets.Pet;

public class MultiIterableNonCollectionSeq {
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		for (Pet pet : nc.reversed())
			printnb(pet + " ");
		print();
		for (Pet pet : nc.randomized())
			printnb(pet + " ");
		print();
		for (Pet pet : nc)
			printnb(pet + " ");
	}
}
