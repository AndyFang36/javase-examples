package exercises.ex23;

import exercises.ex22.ConstructionException;

import static net.mindview.util.Print.*;

public class Test {
	private static boolean b = false;

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 9) b = true;
			try {
				print("Constructing...");
				new FailingConstructor(b);
				try {
					print("Processing...");
				} finally {
					// We do not have a decent method to call for
					// cleanup!
					print("Cleanup...");
				}
			} catch (ConstructionException e) {
				print("Construction has failed:");
				e.printStackTrace(System.out);
				break;
			}
		}
	}
}
