package examples.s04_own_exceptions._01_logging;

public class LoggingExceptions {
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException le) {
			System.out.println("Caught " + le);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException le) {
			System.out.println("Caught " + le);
		}
	}
}
