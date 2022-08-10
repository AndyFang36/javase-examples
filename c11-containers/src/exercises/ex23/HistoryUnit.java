package exercises.ex23;

class HistoryUnit implements Comparable<HistoryUnit> {
	Counter counter;
	Integer val;

	HistoryUnit(Counter counter, Integer val) {
		this.counter = counter;
		this.val = val;
	}

	@Override
	public int compareTo(HistoryUnit o) {
		int lv = o.counter.i;
		int rv = counter.i;
		return (Integer.compare(lv, rv));
	}

	@Override
	public String toString() {
		return "Value = " + val
			+ ", Occurrences = " + counter.i + "\n";
	}
}
