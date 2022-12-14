//: operators/PassObject2.java
// TIJ4 Chapter Operators, Exercise 3, page p98
// Create a class containing a float and use it to demonstrate aliasing during
// method calls
package exercises.e03;

import static net.mindview.util.Print.*;

public class PassObject2 {
	static void f(Box y) {
		y.a = 2.71828f;
	}

	public static void main(String[] args) {
		Box x = new Box();
		x.a = 3.1416f;
		print("1: x.a = " + x.a);
		f(x);
		print("2: x.a = " + x.a);
	}
}

class Box {
	float a;
}
