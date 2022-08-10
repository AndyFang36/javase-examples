package examples.s08_final.final_data;

class Wheel {
	public void spin() {
	}
}

public class FinalArguments {
	void with(final Wheel g) {
		//! g = new Wheel(); // Illegal -- g is final
	}

	void without(Wheel g) {
		g = new Wheel(); // OK -- g not final
		g.spin();
	}

	// void f(final int i) { i++; } // Can’t change
	// You can only read from a final primitive:
	int func(final int i) {
		return i + 1;
	}

	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
		System.out.println(bf.func(1));
	}
}
