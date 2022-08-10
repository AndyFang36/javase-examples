package exercises.ex09;

import java.util.Iterator;

public class SequenceIteration {
	private static final Sequence sequence = new Sequence(10);

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		for (Iterator<Object> it = sequence.iterator(); it.hasNext(); )
			System.out.print(it.next() + " ");
	}
}
