package exercises.ex22;

import static net.mindview.util.Print.*;

public class Test {
	public static void main(String[] args) {
		for (boolean b = false; ; b = !b) {
			try {
				print("Constructing...");
				FailingConstructor fc = new FailingConstructor(b);
				try {
					print("Processing...");
				} finally {
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
