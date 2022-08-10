package examples.s08.varargs;

public class OverloadingVarargs3 {
	static void f(float f, Character... args) {
		System.out.println("first method");
	}

	static void f(int i, Character... args) {
		System.out.println("second method");
	}

	public static void main(String[] args) {
		f(1, 'a');
		f(3.14F, 'b');
	}
}