package exercises.ex02;

public class NullReference {
	public static void main(String[] args) {
		String s = null;
		// Causes a NullPointerException:
		//! s.toString();
		try {
			s.toString();
		} catch (Exception e) {
			System.out.println("Caught exception " + e);
		}
	}
}
