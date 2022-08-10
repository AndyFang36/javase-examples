package exercises.ex04;

public class MyException extends Exception {
	private final String msg;

	public MyException(String msg) {
		this.msg = msg;
	}

	public void printMsg() {
		System.out.println("msg = " + msg);
	}
}
