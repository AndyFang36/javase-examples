package exercises.e11;

import static net.mindview.util.Print.print;

class Cleanser {
	private String s = "Cleanser";

	void append(String a) {
		s += a;
	}

	void dilute() {
		append(" dilute()");
	}

	void apply() {
		append(" apply()");
	}

	void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		print(x);
	}
}
