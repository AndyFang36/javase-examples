package exercises.ex04;

public class ExceptionClass {
	public static void main(String[] args) {
		try {
			throw new MyException("MyException message");
		} catch (MyException e) {
			e.printMsg();
		}
		try {
			throw new MyException2("MyException2 message");
		} catch (MyException2 e) {
			System.out.println(
				"e.getMessage() = " + e.getMessage()
			);
		}
	}
}
