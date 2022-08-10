package exercises.ex09;

public class CatchAll {
	public static void main(String[] args) {
		Thrower2 t = new Thrower2();
		try {
			t.f();
		} catch (ExBase e) {
			System.out.println("caught " + e);
		} catch (Exception e) {
			System.out.println("caught " + e);
		}
	}
}
