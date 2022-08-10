package exercises.ex07;

public class SentenceChecker {
	public static boolean ifMatch(String text) {
		return text.matches("\\p{javaUpperCase}.*\\.");
	}

	public static void main(String[] args) {
		System.out.println(ifMatch("This is correct."));
		System.out.println(ifMatch("bad sentence 1."));
		System.out.println(ifMatch("Bad sentence 2"));
		System.out.println(ifMatch("This is also correct..."));
	}
}
