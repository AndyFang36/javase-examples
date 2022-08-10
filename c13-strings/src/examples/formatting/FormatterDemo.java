package examples.formatting;

import java.io.PrintStream;
import java.util.Formatter;

public class FormatterDemo {
	private final String name;
	private final Formatter f;

	FormatterDemo(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}

	void move(int x, int y) { f.format("%s The turtle is at (%d, %d)\n", this.name, x, y); }

	public static void main(String[] args) {
		PrintStream outAlias = System.out;
		FormatterDemo tommy = new FormatterDemo("Tommy", new Formatter(System.out));
		FormatterDemo terry = new FormatterDemo("Terry", new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
}