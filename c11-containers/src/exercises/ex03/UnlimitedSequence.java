package exercises.ex03;

import java.util.ArrayList;
import java.util.List;

class UnlimitedSequence {
	private final List<Object> items = new ArrayList<>();

	public void add(Object x) {
		items.add(x);
	}

	private class SequenceSelector implements Selector {
		private int i;

		@Override
		public boolean isEnd() {
			return i == items.size();
		}

		@Override
		public Object current() {
			return items.get(i);
		}

		@Override
		public void next() {
			if (i < items.size()) i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}
}
