package exercises.ex12;

class Sequence {
	private final Object[] obj;
	private int next;

	Sequence(int size) {
		obj = new Object[size];
	}

	void add(Object x) throws SequenceFullException {
		if (next < obj.length)
			obj[next++] = x;
		else
			throw new SequenceFullException();
	}

	private class SequenceSelector implements Selector {
		private int i;

		@Override
		public boolean end() {
			return i == obj.length;
		}

		@Override
		public Object current() {
			return obj[i];
		}

		@Override
		public void next() {
			if (i < obj.length) i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}
}
