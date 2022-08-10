package exercises.ex07;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggedArrayIndexBounds {
	private static final Logger logger =
		Logger.getLogger("LoggedArrayIndexBounds");

	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		char[] array = new char[10];
		try {
			array[10] = 'x';
		} catch (ArrayIndexOutOfBoundsException e) {
			logException(e);
		}
	}
}
