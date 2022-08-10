package exercises.ex19;

import exercises.ex17.CommentExtractor;
import exercises.ex18.StringExtractor;
import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassUsageReporter {
	private static final String Identifier
		= "[$A-Za-z_][$A-Za-z_0-9]*";
	private static final String ClassOrInterfaceType
		= Identifier +
		"(?:\\." +
		Identifier +
		")*";
	static final String CU_REP_REGEX
		= "class\\s+" +
		Identifier +
		"|extends\\s+" +
		ClassOrInterfaceType +
		"|implements\\s+" +
		ClassOrInterfaceType +
		"|new\\s+" +
		ClassOrInterfaceType;

	public static void main(String[] args) {
		String source = TextFile.read(
			"F:\\MyDocuments\\Programming\\Backend\\Java\\JavaSE\\C13-Strings\\String.java"
		);

		// Prune away comments:
		source = source.replaceAll(
			CommentExtractor.CMNT_EXT_REGEX,
			""
		);

		// Prune away String literals:
		source = source.replaceAll(
			StringExtractor.STR_EXT_REGEX,
			""
		);

		Pattern p = Pattern.compile(CU_REP_REGEX);
		Matcher m = p.matcher(source);
		while (m.find())
			System.out.println(m.group());
	}
}
