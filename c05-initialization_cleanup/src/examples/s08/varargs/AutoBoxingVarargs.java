package examples.s08.varargs;

public class AutoBoxingVarargs {
	static void f(Integer... args) {
		for (Integer i : args) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		f(new Integer(0), new Integer(1));
		f(2, 3, 4, 5, 6);
		f(7, new Integer(8), 9);
	}
}