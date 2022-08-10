package exercises.e03;

//import static exercises.e03.debug.Debug.*;
//import static exercises.e03.debugoff.Debug.*;

public class DebugTest {
	public static void main(String[] args) {
		exercises.e03.debug.Debug.debug("success");
		exercises.e03.debugoff.Debug.debug("success");
	}
}