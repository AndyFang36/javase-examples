package exercises.ex25;

public class ThreeLevelExceptions {
	public static void main(String[] args) {
		A a = new C();
		try {
			a.f();
		} catch (Level1Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
