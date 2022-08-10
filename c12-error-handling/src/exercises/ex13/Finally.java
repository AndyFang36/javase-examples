package exercises.ex13;

import exercises.ex09.ExBase;
import exercises.ex09.Thrower2;

public class Finally {
	public static void throwNull() {
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		Thrower2 t = new Thrower2();
		try {
			t.f();
		} catch (ExBase e) {
			System.err.println("caught " + e);
		} finally {
			System.out.println("In finally clause A");
		}
		try {
			throwNull();
			t.f();
		} catch (ExBase e) {
			System.err.println("caught " + e);
		} finally {
			System.out.println("In finally clause B");
		}
	}
}
