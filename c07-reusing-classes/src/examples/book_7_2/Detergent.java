package examples.book_7_2;

import static net.mindview.util.Print.*;

public class Detergent extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent d = new Detergent();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();
		print(d);
		print("Testing base class:");
		Cleanser.main(args);
	}
}
