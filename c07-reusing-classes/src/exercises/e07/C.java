package exercises.e07;

class A {
	A(char c, int i) {
		System.out.println("A(char, int)" + i + c);
	}
}

class B extends A {
	B(String s, float f) {
		super(' ', 0);
		System.out.println("B(String, float)" + s + f);
	}
}

class C extends A {
	private char c;
	private int i;

	C(char a, int j) {
		super(a, j);
		c = a;
		i = j;
	}

	B b = new B("hi", 1f); // will then construct another A and then a B

	public static void main(String[] args) {
		C c = new C('b', 2); // will construct an A first
	}
}
