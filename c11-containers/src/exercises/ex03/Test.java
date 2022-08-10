package exercises.ex03;

public class Test {
	public static void main(String[] args) {
		UnlimitedSequence sequence = new UnlimitedSequence();
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.isEnd()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
