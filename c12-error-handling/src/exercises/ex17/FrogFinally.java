package exercises.ex17;

public class FrogFinally {
	public static void main(String[] args) {
		Frog frog = new Frog();
		try {
			// No return in the middle...
		} finally {
			frog.dispose();
		}
		frog = new Frog();
		try {
			// With return in the middle...
			return;
		} finally {
			frog.dispose();
		}
	}
}
