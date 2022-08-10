package examples.s12_collection_iterator;

import examples.pets.Pet;
import examples.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<Pet> {
	private final Pet[] pets = Pets.createArray(8);

	public int size() {
		return pets.length;
	}

	public Iterator<Pet> iterator() {
		return new Iterator<>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < pets.length;
			}

			@Override
			public Pet next() {
				return pets[index++];
			}

			@Override
			public void remove() { //not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
}
