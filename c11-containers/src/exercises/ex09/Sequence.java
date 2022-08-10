package exercises.ex09;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sequence {
	private final Object[] items;
	private int next;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceIterator implements Iterator<Object> {
		private int i;

		@Override
		public boolean hasNext() {
			return i < items.length;
		}

		@Override
		public Object next() {
			if (hasNext())
				return items[i++];
			else
				throw new NoSuchElementException();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	public Iterator<Object> iterator() {
		return new SequenceIterator();
	}
}
