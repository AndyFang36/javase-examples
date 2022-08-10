package exercises.ex18;

public class Test {
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				try {
					lm.f();
				} finally {
					lm.dispose();
				}
			} finally {
				lm.cleanup();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
