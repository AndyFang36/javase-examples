package exercises.e08;

import static net.mindview.util.Print.*;

class A {
	A(char c, int i) {
		print("A(char, int)");
	}
}

class C extends A {
	private char c;
	private int i;

	C() {
		super('z', 3);
		print("C()");
	}

	C(char a, int j) {
		super(a, j);
		c = a;
		i = j;
		print("C(char,int)");
	}

	public static void main(String[] args) {
		C ex1 = new C();
		C ex2 = new C('b', 2);
	}
}

