package exercises.ex03;

import java.io.PrintStream;
import java.util.Formatter;

public class TurtleRedirected {
	private final String name;
	private final Formatter f;

	TurtleRedirected(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}

	void move(int x, int y) {
		f.format("%s The turtle is at (%d, %d)\n", name, x, y);
	}

	public static void main(String[] args) {
		PrintStream outAlias = System.err;
		TurtleRedirected tommy = new TurtleRedirected(
			"Tommy", new Formatter(System.out)
		);
		TurtleRedirected terry = new TurtleRedirected(
			"Terry", new Formatter(outAlias)
		);
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
}
