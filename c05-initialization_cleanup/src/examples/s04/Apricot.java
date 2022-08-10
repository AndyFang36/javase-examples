package examples.s04;

public class Apricot {
	void pit() {
		System.out.println("pit");
	}

	void pick() {
		pit();
	}

	public static void main(String[] args) {
		Apricot apricot = new Apricot();
		apricot.pick();
	}
}
