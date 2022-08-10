package examples.s13_foreach._01_adapter;

import examples.s13_foreach.IterableClass;

import static net.mindview.util.Print.*;

import java.util.*;

public class MultiIterableClass extends IterableClass {
	public Iterable<String> reversed() {
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				return new Iterator<>() {
					int current = words.length - 1;

					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public String next() {
						return words[current--];
					}

					@Override
					public void remove() { // Not implemented
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public Iterable<String> randomized() {
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				List<String> shuffled =
					new ArrayList<>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}

	public static void main(String[] args) {
		MultiIterableClass mic = new MultiIterableClass();
		print("reverse:");
		for (String s : mic.reversed())
			printnb(s + " ");
		print("\nrandomized:");
		for (String s : mic.randomized())
			printnb(s + " ");
		print("\noriginal:");
		for (String s : mic)
			printnb(s + " ");
	}
}
