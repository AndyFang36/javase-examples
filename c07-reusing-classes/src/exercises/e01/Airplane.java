// TIJ4, Chapter Reusing, Exercise 1, page 241
/* Create a simple class. Inside a second class, define a reference to an object of
 * the first class. Use lazy initialization to instantiate this object.
 */
package exercises.e01;

import static net.mindview.util.Print.*;

class Engine {
	private String s;

	Engine() {
		print("Engine()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class Airplane {
	private String fuselage, wings, tail;
	private Engine engine;

	public Airplane() {
		print("Inside Airplane()");
		fuselage = "Body";
		wings = "Airfoils";
		tail = "Empennage";
	}

	public String toString() {
		if (engine == null) // lazy (delayed) initialization:
			engine = new Engine();
		return "\nfuselage = " + fuselage + ", " +
				"\nwings = " + wings + ", " +
				"\ntail = " + tail + ", " +
				"\nEngine = " + engine;
	}

	public static void main(String[] args) {
		Airplane N1234 = new Airplane();
		print(N1234);
	}
}