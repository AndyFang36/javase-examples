// TIJ4 Chapter Initialization, Exercise 13, page 191
// Verify the statements in the previous paragraph.
package exercises.e13;

import static net.mindview.util.Print.*;

class Cup {
	Cup(int maker) {
		print("Cup (" + maker + ")");
	}

	void f(int maker) {
		print("f (" + maker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;

	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	Cups() {
		print("Cups()");
	}
}

public class ExplicitStatic {
	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();
	public static void main(String[] args) {
		print("Inside main()");
		Cups.cup1.f(99);
	}
}
