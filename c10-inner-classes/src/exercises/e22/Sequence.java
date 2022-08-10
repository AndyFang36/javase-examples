package exercises.e22;

class Sequence {
	private int i = 0;
	private final Object[] objects;

	public Sequence(int size) {
		objects = new Object[size];
	}

	public void add(Object x) {
		if (i < objects.length)
			objects[i++] = x;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		@Override
		public boolean isEnd() {
			return i == objects.length;
		}

		@Override
		public Object current() {
			return objects[i];
		}

		@Override
		public void next() {
			if (i < objects.length) ++i;
		}
	}

	private class ReverseSelector implements Selector {
		int i = objects.length - 1;

		@Override
		public boolean isEnd() {
			return (i < 0);
		}

		@Override
		public Object current() {
			return objects[i];
		}

		@Override
		public void next() {
			if (i >= 0) --i;
		}
	}

	public Selector PositiveSelector() {
		return new SequenceSelector();
	}

	public Selector reverseSelector() {
		return new ReverseSelector();
	}
}
