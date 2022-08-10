package exercises.ex05;

public class Resume {
	private static int count = 3;

	static void f() throws ResumeException {
		if (--count > 0)
			throw new ResumeException();
	}
}
