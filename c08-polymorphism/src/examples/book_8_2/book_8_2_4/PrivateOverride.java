package examples.book_8_2.book_8_2_4;

public class PrivateOverride {
	private void f() { // final
		System.out.println("PrivateOverride.f()");
	}

	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride {
	public void f() {
		System.out.println("Derived.f()");
	}
}
