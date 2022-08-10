package examples.s06_Catching_any_exception._01_stack_trace;

public class WhoCalled {
	private static void f() {
		// Generate an exception to fill in the stack trace
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace())
				System.out.println(ste.getMethodName());
		}
	}

	private static void g() {
		f();
	}

	private static void h() {
		g();
	}

	public static void main(String[] args) {
		f();
		System.out.println("---------------");
		g();
		System.out.println("---------------");
		h();
	}
}
