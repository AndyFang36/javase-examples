package examples.s08_final.final_data;

class Poppet {
	private int i;

	Poppet(int ii) {
		this.i = ii;
	}
}

public class BlankFinal {
	// Initialized final
	private final int i = 0;
	// Blank final
	private final int j;
	// Blank final reference
	private final Poppet p;

	// Blank finals MUST be initialized in the constructor:
	BlankFinal() {
		j = 1;
		p = new Poppet(1);
	}

	BlankFinal(int x) {
		j = x;
		p = new Poppet(x);
	}

	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);
	}
}
