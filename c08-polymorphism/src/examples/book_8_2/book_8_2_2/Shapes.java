package examples.book_8_2.book_8_2_2;

import java.util.Random;

class Shape {
	protected void draw() {
	}

	protected void erase() {
	}
}

class Circle extends Shape {
	protected void draw() {
		System.out.println("Circle.draw()");
	}

	protected void erase() {
		System.out.println("Circle.erase()");
	}
}

class Square extends Shape {
	protected void draw() {
		System.out.println("Square.draw()");
	}

	protected void erase() {
		System.out.println("Square.erase()");
	}
}

class Triangle extends Shape {
	protected void draw() {
		System.out.println("Triangle.draw()");
	}

	protected void erase() {
		System.out.println("Triangle.erase()");
	}
}

class RandomShapeGenerator {
	private Random rand = new Random(47);

	public Shape newShape() {
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

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.newShape();
		// Make polymorphic method calls:
		for(Shape temp : s)
			temp.draw();
	}
}
