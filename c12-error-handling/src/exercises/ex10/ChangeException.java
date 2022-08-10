package exercises.ex10;

class AnException extends Exception {
	AnException(String s){
		super(s);
	}
}

class AnotherException extends Exception {
}

public class ChangeException {
	public void g() throws AnException {
		throw new AnException("thrown from g()");
	}

	public void f() throws AnotherException {
		try {
			g();
		} catch (AnException e) {
			throw new AnotherException();
		}
	}

	public static void main(String[] args) {
		ChangeException ce = new ChangeException();
		try {
			ce.f();
		} catch (AnotherException e) {
			System.out.println("Caught " + e);
		}
	}
}
