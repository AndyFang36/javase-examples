package examples.s07_standard_exception;

public class NeverCaught {
	static void f() {
		throw new RuntimeException("from f()");
	}

	static void g() {
		f();
	}

	public static void main(String[] args) {
		g();
	}
}
