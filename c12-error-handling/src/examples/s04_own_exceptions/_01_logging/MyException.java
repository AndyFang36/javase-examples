package examples.s04_own_exceptions._01_logging;

public class MyException extends Exception {
	private int x;

	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}

	public MyException(String msg, int x) {
		super(msg);
		this.x = x;
	}

	public int val() {
		return x;
	}

	@Override
	public String getMessage() {
		return "Detail Message: " + x + " " + super.getMessage();
	}
}
