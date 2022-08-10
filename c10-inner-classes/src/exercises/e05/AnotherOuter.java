package exercises.e05;

public class AnotherOuter {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
}
