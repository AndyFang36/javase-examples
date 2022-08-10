package exercises.e12;

import java.util.Random;

import static net.mindview.util.Print.*;

class Characteristic {
	private String s;

	Characteristic(String s) {
		this.s = s;
		print("Creating Characteristic: " + s);
	}
}

class Description {
	private String s;

	Description(String s) {
		this.s = s;
		print("Creating Description: " + s);
	}
}

class Rodent {
	private String name = "Rodent";
	private Characteristic c = new Characteristic("has tail");
	private Description d = new Description("small mammal");

	Rodent() {
		print("Rodent()");
	}

	protected void eat() {
		print("Rodent.eat()");
	}

	protected void run() {
		print("Rodent.run()");
	}

	protected void sleep() {
		print("Rodent.sleep()");
	}

	public String toString() {
		return name;
	}
}

class Mouse extends Rodent {
	private String name = "Mouse";
	private Characteristic c = new Characteristic("likes cheese");
	private Description d = new Description("nocturnal");

	Mouse() {
		print("Mouse()");
	}

	protected void eat() {
		print("Mouse.eat()");
	}

	protected void run() {
		print("Mouse.run()");
	}

	protected void sleep() {
		print("Mouse.sleep()");
	}

	public String toString() {
		return name;
	}
}

class Rat extends Rodent {
	private String name = "Rat";
	private Characteristic c = new Characteristic("larger");
	private Description d = new Description("black");

	Rat() {
		print("Rat()");
	}

	protected void eat() {
		print("Rat.eat()");
	}

	protected void run() {
		print("Rat.run()");
	}

	protected void sleep() {
		print("Rat.sleep()");
	}

	public String toString() {
		return name;
	}
}

class Squirrel extends Rodent {
	private String name = "Squirrel";
	private Characteristic c = new Characteristic("climbs trees");
	private Description d = new Description("likes nuts");

	Squirrel() {
		print("Squirrel()");
	}

	protected void eat() {
		print("Squirrel.eat()");
	}

	protected void run() {
		print("Squirrel.run()");
	}

	protected void sleep() {
		print("Squirrel.sleep()");
	}

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

public class RodentTest {
	private static RodentGenerator g = new RodentGenerator();

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[3];
		for (Rodent r : rodents) {
			r = g.makeNew();
			print(r + "\n");
		}
	}
}
