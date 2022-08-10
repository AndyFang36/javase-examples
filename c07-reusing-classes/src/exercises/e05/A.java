package exercises.e05;

class A {
	private String s;

	A() {
		System.out.println("A()");
		s = "A is Constructed";
	}

	public String toString() {
		return s;
	}
}
