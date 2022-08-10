package exercises.e19;

class Poppet {
	private int i;

	Poppet(int k) {
		i = k;
	}

	public String toString() {
		return ("Poppet " + i);
	}
}

public class BlankFinalEx {
	// Blank final reference
	private final Poppet p;

	// Blank finals MUST be initialized in the constructor:
	public BlankFinalEx() {
		p = new Poppet(1);
	}

	public BlankFinalEx(int x) {
		p = new Poppet(x);
	}

	public static void main(String[] args) {
		BlankFinalEx b1 = new BlankFinalEx();
		BlankFinalEx b2 = new BlankFinalEx(47);
		// b1.p = new Poppet(2); // Errors: cannot assign values
		// b2.p = new Poppet(3); // to final variables p
		System.out.println("b1.p: " + b1.p);
		System.out.println("b2.p: " + b2.p);
	}
}