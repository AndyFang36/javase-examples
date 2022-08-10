package exercises.e07;

import java.util.Random;

import static net.mindview.util.Print.*;

interface Rodent {
	String name = "Rodent";

	void eat();

	void run();

	void sleep();

	@Override
	String toString();
}

class Mouse implements Rodent {
	private String name = "Mouse";

	@Override
	public void eat() {
		print("Mouse.eat()");
	}

	@Override
	public void run() {
		print("Mouse.run()");
	}

	@Override
	public void sleep() {
		print("Mouse.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Rat implements Rodent {
	private String name = "Rat";

	@Override
	public void eat() {
		print("Rat.eat()");
	}

	@Override
	public void run() {
		print("Rat.run()");
	}

	@Override
	public void sleep() {
		print("Rat.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Squirrel implements Rodent {
	private String name = "Squirrel";

	@Override
	public void eat() {
		print("Squirrel.eat()");
	}

	@Override
	public void run() {
		print("Squirrel.run()");
	}

	@Override
	public void sleep() {
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
		Rodent[] rodents = new Rodent[3];
		for (Rodent r : rodents) {
			r = generator.makeNew();
			print(r + ": ");
			r.eat();
			r.run();
			r.sleep();
			print();
		}
	}
}
