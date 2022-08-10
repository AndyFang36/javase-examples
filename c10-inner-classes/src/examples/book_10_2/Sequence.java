package examples.book_10_2;

interface Selector {
	boolean isEnd();

	Object current();

	void next();
}

public class Sequence {
	private Object[] items;
	private int i = 0;

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
			return (i == items.length);
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length)
				++i;
		}
	}

	public Selector newsSelector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.newsSelector();
		while (!selector.isEnd()) {
			System.out.println(selector.current() + "");
			selector.next();
		}
	}
}
