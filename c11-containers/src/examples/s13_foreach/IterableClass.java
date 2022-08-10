package examples.s13_foreach;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
	protected String[] words = (
		"And that is how " + "we know the Earth to be banana-shaped."
	).split(" ");

	@Override
	public Iterator<String> iterator() {
		return new Iterator<>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			@Override
			public String next() {
				return words[index++];
			}

			@Override
			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		for (String s : new IterableClass())
			System.out.print(s + " ");
	}
}
