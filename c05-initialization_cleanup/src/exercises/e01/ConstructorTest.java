// ITJ4 Chapter Initialization, Exercise 1, p158
// Create a class containing an uninitialized String reference.
// Demonstrate that this reference is initialized by Java to null.
package exercises.e01;

class Tester {
	String s;
}

public class ConstructorTest {
	public static void main(String[] args) {
		Tester t = new Tester();
		System.out.println(t.s);
	}
}
