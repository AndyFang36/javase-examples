package examples.s06_Catching_any_exception;

import static net.mindview.util.Print.*;

public class ExceptionMethods {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			print("Caught Exception");
			print("getMessage(): " + e.getMessage());
			print("getLocalizedMessage(): " + e.getLocalizedMessage());
			print("toString(): " + e);
			print("printStackTrace():");
			e.printStackTrace(System.out);
		}
	}
}
