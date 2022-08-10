package examples.s08.varargs;

public class OptionalTrailingArgs {
	static void f(int required, String... trailing) {
		System.out.println("required: " + required);
		for (String s : trailing) {
			System.out.println(s + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		f(0);
		f(1, "hello");
		f(2, "hello", "world");
	}
}