package exercises.ex30;

import examples.pets.Pet;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		CollectionSequence.display(c);
		CollectionSequence.display(c.iterator());
		System.out.println(
			Arrays.toString(c.toArray(new Pet[0]))
		);
	}
}
