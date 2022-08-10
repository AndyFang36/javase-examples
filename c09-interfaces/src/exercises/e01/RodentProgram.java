package exercises.e01;

import java.util.Random;

import static net.mindview.util.Print.*;

abstract class Rodent {
	private String name = "Rodent";

	abstract protected void eat();

	abstract protected void run();

	abstract protected void sleep();

	@Override
	abstract public String toString();
}

class Mouse extends Rodent {
	private String name = "Mouse";

	@Override
	protected void eat() {
		print("Mouse.eat()");
	}

	@Override
	protected void run() {
		print("Mouse.run()");
	}

	@Override
	protected void sleep() {
		print("Mouse.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Rat extends Rodent {
	private String name = "Rat";

	@Override
	protected void eat() {
		print("Rat.eat()");
	}

	@Override
	protected void run() {
		print("Rat.run()");
	}

	@Override
	protected void sleep() {
		print("Rat.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Squirrel extends Rodent {
	private String name = "Squirrel";

	@Override
	protected void eat() {
		print("Squirrel.eat()");
	}

	@Override
	protected void run() {
		print("Squirrel.run()");
	}

	@Override
	protected void sleep() {
		print("Squirrel.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class RodentGenerator {
	private Random r = new Random();

	Rodent makeNew() {
		switch (r.nextInt(3)) {
			default:
			case 0:
				return new Mouse();
			case 1:
				return new Rat();
			case 2:
				return new Squirrel();
		}
	}
}

public class RodentProgram {
	private static RodentGenerator generator = new RodentGenerator();

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[10];
		for (Rodent r : rodents) {
			r = generator.makeNew();
			print(r + ": ");
			r.eat();
			r.run();
			r.sleep();
		}
	}
}
