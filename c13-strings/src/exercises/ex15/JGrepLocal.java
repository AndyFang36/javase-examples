package exercises.ex15;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.*;

public class JGrepLocal {
	private static final int[] FLAG = {
		Pattern.CANON_EQ,
		Pattern.CASE_INSENSITIVE,
		Pattern.COMMENTS,
		Pattern.DOTALL,
		Pattern.MULTILINE,
		Pattern.UNICODE_CASE,
		Pattern.UNIX_LINES
	};

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[sct]\\w+", FLAG[1]);
		Matcher m = p.matcher("");
		int index = 0;
		for (String line : new TextFile("temp.txt")) {
			m.reset(line);
			while (m.find()) {
				printnb(index + ": \"" + m.group() + "\" ");
				print("[" + m.start() + "," + (m.end() - 1) + "]");
				++index;
			}
		}
	}
}
