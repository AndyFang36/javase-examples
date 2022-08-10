package exercises.e10;

class A {
	protected void f() {
		System.out.println("A.f()");
		this.g();
	}

	protected void g() {
		System.out.println("A.g()");
	}
}

class B extends A {
	@Override
	public void g() {
		System.out.println("B.g()");
	}
}

public class Test {
	public static void main(String[] args) {
		A temp = new B();
		temp.g();
	}
}
