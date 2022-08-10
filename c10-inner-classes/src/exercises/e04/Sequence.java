package exercises.e04;

interface Selector {
	boolean isEnd();

	Object current();

	void next();
}

public class Sequence {
	private final Object[] items;
	private int i = 0;

	// to test SequenceSelector sequence4() in main():
	public void test() {
		System.out.println("Sequence.test()");
	}

	Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (i < items.length)
			items[i++] = x;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		@Override
		public boolean isEnd() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length) i++;
		}

		// method to produce outer class reference:
		public Sequence sequenceThis() {
			return Sequence.this;
		}
	}

	public Selector selectorNew() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selectorNew();
		while (!selector.isEnd()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		// cast and test:
		((SequenceSelector) selector).sequenceThis().test();
	}
}