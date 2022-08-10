package exercises.e04;

import java.util.Random;

class Shape {
	protected void draw() {
		System.out.println("Shape.draw()");
	}

	protected void erase() {
		System.out.println("Shape.erase()");
	}

	protected void amend() {
		System.out.println("Shape.amend()");
	}
}

class Circle extends Shape {
	@Override
	protected void draw() {
		System.out.println("Circle.draw()");
	}

	@Override
	protected void erase() {
		System.out.println("Circle.erase()");
	}

	@Override
	protected void amend() {
		System.out.println("Circle.amend()");
	}
}

class Square extends Shape {
	@Override
	protected void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	protected void erase() {
		System.out.println("Square.erase()");
	}
}

class Triangle extends Shape {
	@Override
	protected void draw() {
		System.out.println("Triangle.draw()");
	}

	@Override
	protected void erase() {
		System.out.println("Triangle.erase()");
	}
}

class Rectangle extends Shape {
}

class RandomShapeGenerator {
	private Random rand = new Random(47);

	public Shape newShape() {
		switch (rand.nextInt(4)) {
			default:
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
			case 3:
				return new Rectangle();
		}
	}
}

public class ShapesTest3 {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[12];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.newShape();
		// Make polymorphic method calls:
		for (Shape temp : s) {
			temp.draw();
			temp.amend();
			temp.erase();
			System.out.println();
		}

	}
}
