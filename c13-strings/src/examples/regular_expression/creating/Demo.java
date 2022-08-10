package examples.regular_expression.creating;

public class Demo {
	public static void main(String[] args) {
		String[] patterns = new String[]{"Demo", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"};
		for (String pattern : patterns)
			System.out.println("Demo".matches(pattern));
	}
}