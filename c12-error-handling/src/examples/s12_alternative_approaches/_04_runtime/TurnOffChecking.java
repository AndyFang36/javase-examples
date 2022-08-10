package examples.s12_alternative_approaches._04_runtime;

import java.io.FileNotFoundException;
import java.io.IOException;

import static net.mindview.util.Print.*;

public class TurnOffChecking {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		// You can call throwRuntimeException() without a try
		// block, and let RuntimeExceptions leave the method:
		wce.throwRuntimeException(3);
		// Or you can choose to catch exceptions:
		for (int i = 0; i < 4; i++) {
			try {
				if (i < 3)
					wce.throwRuntimeException(i);
				else
					throw new SomeOtherException();
			} catch (SomeOtherException e) {
				print("SomeOtherException: " + e);
			} catch (RuntimeException re) {
				try {
					throw re.getCause();
				} catch (FileNotFoundException e) {
					print("FileNotFoundException: " + e);
				} catch (IOException e) {
					print("IOException: " + e);
				} catch (Throwable e) {
					print("Throwable: " + e);
				}
			}
		}
	}
}
