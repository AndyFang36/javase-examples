package exercises.e04;

public class C extends B{
	private String s;

	C() {
		System.out.println("C()");
		s = "C is Constructed";
	}

	public String toString() {
		return s;
	}
}
