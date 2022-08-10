package examples.regular_expression.replacements;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class Replacements {
	public static void main(String[] args) {
		String text = TextFile.read("Replacements.txt");
		// Match the specially commented block of text above:
		String regEx = "/\\*!(.*)!\\*/";
		Matcher m = Pattern.compile(regEx, Pattern.DOTALL).matcher(text);
		while (m.find())
			text = m.group(); // Captured by parentheses
		// Replace two or more spaces with a single space:
		text = text.replaceAll(" {2,}", " ");
		// Replace one or more spaces at the beginning of each
		// line with no spaces. Must enable MULTILINE mode:
		text = text.replaceAll("(?m)^ +", "");
		print(text);
		String text2 = text.replaceFirst(
			"[aeiou]", "(VOWEL1)"
		);
		print(text2);
		StringBuffer buffer = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m2 = p.matcher(text);
		// Process the find information as you
		// perform the replacements:
		while (m2.find())
			m2.appendReplacement(buffer, m2.group().toUpperCase());
		// Put in the remainder of the text:
		m2.appendTail(buffer);
		print(buffer);
	}
}
