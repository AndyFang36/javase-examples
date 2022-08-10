package examples.regular_expression.Pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFlags {
	private static final String text
		= "java has regex\nJava has regex\n" +
		"JAVA has pretty good regular expressions\n" +
		"Regular expressions are in Java";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(
			"^java",
			Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
		);
		Matcher m = p.matcher(text);
		while (m.find())
			System.out.println(m.group());
	}
}
