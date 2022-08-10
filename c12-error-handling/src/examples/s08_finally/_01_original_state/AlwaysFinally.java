package examples.s08_finally._01_original_state;

import static net.mindview.util.Print.*;

class FourException extends Exception {
}

public class AlwaysFinally {
	public static void main(String[] args) {
		print("Entering 1st try block");
		try {
			print("entering 2nd try block");
			try {
				throw new FourException();
			} finally {
				print("finally in 2nd try block");
			}
		} catch (FourException fe) {
			print("Caught FourException in 1st try block");
		} finally {
			print("finally in 1st try block");
		}
	}
}
