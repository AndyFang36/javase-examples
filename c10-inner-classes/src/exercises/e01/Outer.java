package exercises.e01;

public class Outer {
	static class Inner {
		Inner() {
			System.out.println("Inner()");
		}
	}

	Inner makeNew() {
		return new Inner();
	}

	Outer() {
		System.out.println("Outer()");
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.makeNew();
	}
}
