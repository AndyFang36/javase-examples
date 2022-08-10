package exercises.ex32;

import examples.pets.Pet;

import java.util.*;

public class NonCollectionSequence
	extends PetSequence
	implements Iterable<Pet> {
	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			@Override
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					int current = pets.length - 1;

					public boolean hasNext() {
						return current > -1;
					}

					public Pet next() {
						return pets[current--];
					}

					public void remove() { // Not implemented
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public Iterable<Pet> randomized() {
		return new Iterable<Pet>() {
			@Override
			public Iterator<Pet> iterator() {
				List<Pet> shuffled =
					new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}

	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
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
			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
}
