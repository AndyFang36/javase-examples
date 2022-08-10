package exercises.ex06;

public class LoggingExceptions {
	public static void main(String[] args) {
		try {
			throw new LoggingException1();
		} catch (LoggingException1 e) {
			System.err.println("Caught " + e);
		}
		try {
			throw new LoggingException2();
		} catch (LoggingException2 e) {
			System.err.println("Caught " + e);
		}
	}
}
