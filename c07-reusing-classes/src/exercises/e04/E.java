package exercises.e04;

public class E extends D {
	E() {
		System.out.println("E()");
	}

	public static void main(String[] args) {
		E e = new E();
		System.out.println(e);
		// test D:
		D.main(args);
	}
}
