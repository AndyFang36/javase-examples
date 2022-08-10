package exercises.ex05;

public class Resumption {
	public static void main(String[] args) {
		while (true) {
			try {
				Resume.f();
			} catch (ResumeException re) {
				System.out.println("Caught " + re);
			}
			System.out.println("Got through...");
			break;
		}
		System.out.println("Successful execution.");
	}
}
