package exercises.ex08;

import exercises.ex04.MyException;

public class Thrower {
	public void f() {
		// Compiler gives an error: "unreported
		// exception MyException; must be caught
		// or declared to be thrown"
		//! throw new MyException("Inside f()");
	}

	public void g() throws MyException {
		throw new MyException("Inside g()");
	}
}
