package exercises.ex17;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentExtractor {
	public static final String CMNT_EXT_REGEX
		= "(?x)(?m)(?s) # Comments, Multiline & Dotall: ON\n" +
		"/\\* # Match START OF THE COMMENT\n" +
		"(.*?) # Match all chars\n" +
		"\\*/ # Match END OF THE COMMENT\n" +
		"| //(.*?)$ # OR Match C++ style comments\n";

	public static void main(String[] args) {
		String source = TextFile.read(
			"F:\\MyDocuments\\Programming\\Backend\\Java\\JavaSE\\C13-Strings\\String.java"
		);
		Pattern p = Pattern.compile(CMNT_EXT_REGEX);
		Matcher m = p.matcher(source);
		while (m.find()) {
			System.out.println(
				m.group(1) != null ? m.group(1) : m.group(2)
			);
		}
	}
}
