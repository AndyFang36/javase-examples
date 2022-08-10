package exercises.e03;

public class Outer {
	private String s="Leaning Java";

	class Inner {
		Inner() {
			System.out.println("Inner()");
		}

		@Override
		public String toString() {
			return s;
		}
	}

	Inner newInner() {
		return new Inner();
	}

	Outer() {
		System.out.println("Outer()");
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.newInner();
		System.out.println(inner);
	}
}
