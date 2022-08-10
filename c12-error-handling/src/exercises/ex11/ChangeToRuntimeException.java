package exercises.ex11;

class AnException2 extends Exception {
}

public class ChangeToRuntimeException {
	public static void g() throws AnException2 {
		throw new AnException2();
	}

	public static void f() {
		try {
			g();
		} catch (AnException2 e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		f();
	}
}