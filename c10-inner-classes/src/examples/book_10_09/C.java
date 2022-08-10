package examples.book_10_09;

class A {
	class B {
	}
}

public class C extends A.B {
	//! C() {} // Won’t compile
	C(A a) {
		a.super();
	}

	public static void main(String[] args) {
		A a = new A();
		C c = new C(a);
	}
}
