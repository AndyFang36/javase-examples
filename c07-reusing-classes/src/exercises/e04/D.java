package exercises.e04;

public class D extends C {
	D() {
		System.out.println("D()");
	}

	static D makeD() {
		return new D();
	}

	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1);
		D d2 = makeD();
	}
}
