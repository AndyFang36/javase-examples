package examples.book_8_3.book_8_3_3;

import static net.mindview.util.Print.*;

class Glyph {
	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}

	protected void draw() {
		print("Glyph.draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph(), radius = " + radius);
	}

	protected void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructor {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
