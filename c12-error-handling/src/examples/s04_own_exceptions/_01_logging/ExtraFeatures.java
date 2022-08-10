package examples.s04_own_exceptions._01_logging;

import static net.mindview.util.Print.*;

public class ExtraFeatures {
	public static void f() throws MyException {
		print("Throwing MyException from f()");
		throw new MyException();
	}

	public static void g() throws MyException {
		print("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}

	public static void h() throws MyException {
		print("Throwing MyException from h()");
		throw new MyException("Originated in h()", 47);
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (MyException e) {
			e.printStackTrace(System.out);
			System.out.println("e.val() = " + e.val());
		}
	}
}
