package exercises.e05;

public class Outer {
	public Outer() {
		System.out.println("Outer()");
	}

	public class Inner {
		public Inner() {
			System.out.println("Inner()");
		}
	}
}
