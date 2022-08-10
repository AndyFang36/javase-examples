package exercises.e02;

class Word {
	private String word;

	public Word(String s) {
		word = s;
	}

	@Override
	public String toString() {
		return word;
	}
}

interface Selector {
	boolean isEnd();

	Object current();

	void next();
}

public class Sequence {
	private Object[] items;
	private int i = 0;

	public Sequence(int size) {
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
	}

	public Selector newSelector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(new Word(Integer.toString(i)));
		Selector selector = sequence.newSelector();
		while (!selector.isEnd()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		// exercise2:
		System.out.println();
		Word w1 = new Word("Peace");
		Word w2 = new Word("Love");
		Word w3 = new Word("Easter");
		Sequence message = new Sequence(3);
		message.add(w1);
		message.add(w2);
		message.add(w3);
		Selector sel = message.newSelector();
		while (!sel.isEnd()) {
			System.out.print(sel.current() + " ");
			sel.next();
		}
	}
}
