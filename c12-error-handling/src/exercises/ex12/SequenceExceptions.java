package exercises.ex12;

public class SequenceExceptions {
	public static void main(String[] args) throws SequenceFullException {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 11; i++)
			sequence.add(Integer.toString(i));
	}
}
