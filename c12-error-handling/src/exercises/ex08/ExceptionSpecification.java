package exercises.ex08;

import exercises.ex04.MyException;

public class ExceptionSpecification {
	public static void main(String[] args) {
		Thrower t = new Thrower();
		try {
			t.g();
		} catch (MyException e) {
			e.printMsg();
		}
	}
}
