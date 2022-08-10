package exercises.e04;

class B extends A{
	private String s;

	B() {
		System.out.println("B()");
		s = "B is Constructed";
	}

	public String toString() {
		return s;
	}
}
