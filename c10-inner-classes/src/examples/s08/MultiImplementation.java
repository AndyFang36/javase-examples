package examples.s08;

class D {}

abstract class E {}

class Z extends E {
	E makeE() {
		return new E() {};
	}
}

public class MultiImplementation {
	static void takesD(Z d) { }

	static void takesE(E e) { }

	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}