package exercises.e15;

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

class RectangularGlyph extends Glyph {
	private int length = 2;
	private int width = 4;

	RectangularGlyph(int l, int w) {
		length = l;
		width = w;
		print("RectangularGlyph(), length = " + length + ", width = " + width);
	}

	protected void draw() {
		print("RectangularGlyph.draw(), length = " + length + ", width = " + width);
	}
}

public class PolyConstructorEx {
	public static void main(String[] args) {
		new RoundGlyph(5);
		print();
		new RectangularGlyph(3, 6);
	}
}
