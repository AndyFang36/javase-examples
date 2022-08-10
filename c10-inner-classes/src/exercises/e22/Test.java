package exercises.e22;

import static net.mindview.util.Print.*;

public class Test {
	public static void main(String[] args) {
		// add numbers:
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			String num = Integer.toString(i);
			sequence.add(num);
		}
		// Optimise order:
		Selector selector1 = sequence.PositiveSelector();
		while (!selector1.isEnd()) {
			printnb(selector1.current() + " ");
			selector1.next();
		}
		// Reverse order:
		print();
		Selector selector2 = sequence.reverseSelector();
		while (!selector2.isEnd()) {
			printnb(selector2.current() + " ");
			selector2.next();
		}
	}
}
