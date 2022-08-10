package exercises.ex18;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExtractor {
	public static final String STR_EXT_REGEX
		= "\"(?:[^\"\\\\\\n\\r]|(?:\\\\(?:[untbrf\\\\'\"]" +
		"|[0-9A-Fa-f]{4}|[0-7]{1,2}|[0-3][0-7]{2})))*\"";

	public static void main(String[] args) {
		String source = TextFile.read(
			"F:\\MyDocuments\\Programming\\Backend\\Java\\JavaSE\\C13-Strings\\String.java"
		);
		Pattern p = Pattern.compile(STR_EXT_REGEX);
		Matcher m = p.matcher(source);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
