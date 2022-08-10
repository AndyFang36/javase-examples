package exercises.ex06;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException1 extends Exception {
	private static final Logger logger
		= Logger.getLogger("LoggingException1");

	public LoggingException1() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
