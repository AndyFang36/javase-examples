/* Modify Exercise 16 so that Frog overrides the method definitions from
 * the base class (provides new definitions using the same method
 * signatures). Note what happen in main().
 * ( Exercise 16:Create a class called Amphibian. From this, inherit a class
 * called Frog. Put appropriate methods in the base class. In main(), create a
 * Frog and up cast it to Amphibian, and demonstrate that all the methods still
 * work.)
 */
package exercises.e17;

import static net.mindview.util.Print.*;

class Amphibian {
	protected void swim() {
		print("Amphibian swim");
	}

	protected void speak() {
		print("Amphibian speak");
	}

	void eat() {
		print("Amphibian eat");
	}

	static void grow(Amphibian a) {
		print("Amphibian grow");
		a.eat();
	}
}

public class Frog17 extends Amphibian {
	@Override
	protected void swim() {
		print("Frog swim");
	}

	@Override
	protected void speak() {
		print("Frog speak");
	}

	@Override
	void eat() {
		print("Frog eat");
	}

	static void grow(Amphibian a) {
		print("Frog grow");
		a.eat();
	}

	public static void main(String[] args) {
		Frog17 f = new Frog17();
		// call overridden base-class methods:
		f.swim();
		f.speak();
		f.eat();
		// up cast Frog17 to Amphibian argument:
		grow(f);
		// up cast Frog17 to Amphibian and call Amphibian method:
		Amphibian.grow(f);
	}
}
