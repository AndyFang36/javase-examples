package exercises.ex10;

import static net.mindview.util.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForMatch {
	static String source = "Java now has regular expressions";
	static String[] regEx = {
		"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?",
		"s*", "s+", "s{4}", "s{1}.", "s{0,3}"
	};

	public static void main(String[] args) {
		print("Source String: " + source + "\n");
		for (String pattern : regEx) {
			print("Regular expression: \"" + pattern + "\"");
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(source);
			if (m.find()) {
				printnb("Match \"" + m.group() + "\" ");
				print("at positions " + m.start() + "-" + (m.end() - 1));
			} else
				print("Doesn't match");
			print();
		}
	}
}
