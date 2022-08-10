package examples.s08.varargs;

public class OverloadingVarargs {
	static void f(Character... args) {
		System.out.println("first method");
		for (Character c : args) {
			System.out.println(" " + c);
		}
		System.out.println();
	}

	static void f(Integer... args) {
		System.out.println("second method");
		for (Integer i : args) {
			System.out.println(" " + i);
		}
		System.out.println();
	}

	static void f(Float... args) {
		System.out.println("third method");
	}

	public static void main(String[] args) {
		f('A', 'B', '你', '好');
		f(1);
		f(1, 2);
		f(0);
		f(3.14F);
		//! f();  // won't compile -- ambiguous
	}
}