package exercises.e31;

import java.util.Iterator;
import java.util.Random;

class RandomShapeGenerator implements Iterable<Shape> {
	private final Random rand = new Random(47);
	private final int quantity;

	RandomShapeGenerator(int quantity) { this.quantity = quantity; }

	@Override
	public Iterator<Shape> iterator() {
		return new Iterator<>() {
			private int count;

			@Override
			public boolean hasNext() { return count < quantity; }

			@Override
			public Shape next() {
				++count;
				return nextShape();
			}

			@Override
			public void remove() { throw new UnsupportedOperationException(); }
		};
	}

	private Shape nextShape() {
		switch (rand.nextInt(3)) {
			default:
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
		}
	}
}