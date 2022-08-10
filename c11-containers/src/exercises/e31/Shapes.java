package exercises.e31;

import static net.mindview.util.Print.*;

class Circle implements Shape {
	@Override
	public void draw() { print("Circle.draw()"); }

	@Override
	public void erase() { print("Circle.erase()"); }
}

class Square implements Shape {
	@Override
	public void draw() { print("Square.draw()"); }

	@Override
	public void erase() { print("Square.erase()"); }
}

class Triangle implements Shape {
	@Override
	public void draw() { print("Triangle.draw()"); }

	@Override
	public void erase() { print("Triangle.erase()"); }
}