// TIJ4 Chapter Reusing, Exercise 11, page 248
// Modify Detergent.java so that is uses delegation.
package exercises.e11;

import static net.mindview.util.Print.*;

public class DetergentDelegation {
	private String s = "DetergentDelegation";
	Cleanser c = new Cleanser();

	void append(String a) {
		s += a;
	}

	// two methods delegated entirely to Cleanser c:
	void dilute() {
		c.dilute();
	}

	void apply() {
		c.apply();
	}

	// method delegated in part to Cleanser c:
	void scrub() {
		append(" DetergentDelegation.scrub()");
		c.scrub();
	}

	void foam() {
		append(" foam()");
	}

	public String toString() {
		return s + " " + c;
	}

	public static void main(String[] args) {
		DetergentDelegation x = new DetergentDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}
