package exercises.e14;

import java.util.Random;

import static net.mindview.util.Print.*;

class Shared {
	private int refCount = 0;
	private static long counter = 1;
	private final long id = counter++;

	public Shared() {
		print("Creating " + this);
	}

	public void addRef() {
		refCount++;
	}

	public String toString() {
		return "Shared " + id;
	}

	public void showRefCount() {
		print("refCount = " + refCount);
	}
}

class Characteristic {
	private String s;

	Characteristic(String temp) {
		this.s = temp;
		print("Creating Characteristic: " + temp);
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
	private Shared shared;
	private static long counter = 1;
	private final long id = counter++;
	private Characteristic c = new Characteristic("has tail");
	private Description d = new Description("small mammal");

	Rodent(Shared temp) {
		print("Rodent() " + id);
		this.shared = temp;
		this.shared.addRef();
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
		return name + " " + id;
	}
}

class Mouse extends Rodent {
	private String name = "Mouse";
	private Characteristic c = new Characteristic("likes cheese");
	private Description d = new Description("nocturnal");

	Mouse(Shared shared) {
		super(shared);
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
		return name + ", " + super.toString();
	}
}

class Rat extends Rodent {
	private String name = "Rat";
	private Characteristic c = new Characteristic("larger");
	private Description d = new Description("black");

	Rat(Shared shared) {
		super(shared);
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
		return name + ", " + super.toString();
	}
}

class Squirrel extends Rodent {
	private String name = "Squirrel";
	private Characteristic c = new Characteristic("climbs trees");
	private Description d = new Description("likes nuts");

	Squirrel(Shared shared) {
		super(shared);
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
		return name + ", " + super.toString();
	}
}

class RodentGenerator {
	// same shared object to be passed to every Rodent:
	protected Shared shared = new Shared();
	private Random rand = new Random();

	Rodent makeNew() {
		switch (rand.nextInt(3)) {
			default:
			case 0:
				return new Mouse(shared);
			case 1:
				return new Rat(shared);
			case 2:
				return new Squirrel(shared);
		}
	}
}

public class RodentEx14 {
	private static RodentGenerator g = new RodentGenerator();

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[3];
		for (Rodent r : rodents) {
			r = g.makeNew();
			print(r + "\n");
		}
		g.shared.showRefCount();
	}
}
