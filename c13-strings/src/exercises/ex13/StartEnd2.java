package exercises.ex13;

import examples.regular_expression.Pattern_Matcher.Groups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class StartEnd2 {
	public static String text = Groups.POEM;

	private static class Display {
		private boolean regexPrinted = false;
		private final String regex;

		Display(String regex) {
			this.regex = regex;
		}

		void display(String msg) {
			if (!regexPrinted) {
				print("regex = " + regex);
				regexPrinted = true;
			}
			print(msg);
		}
	}

	static void examine(String text, String regex) {
		Display d = new Display(regex);
		Matcher m = Pattern.compile(regex).matcher(text);
		while (m.find()) {
			d.display(
				"find() \"" + m.group() + "\"" +
					" start = " + m.start() +
					" end = " + m.end()
			);
		}
		if (m.lookingAt()) // No reset() necessary
			d.display("lookingAt() start = " + m.start() + " end = " + m.end());
		if (m.matches()) // No reset() necessary
			d.display("creating() start = " + m.start() + " end = " + m.end());
	}

	public static void main(String[] args) {
		String[] regExs = {
			"\\w*ere\\w*", "\\w*at", "t\\w+", "T.*?."
		};
		for (String in : text.split("\n")) {
			print("input : " + in);
			for (String regex : regExs)
				examine(in, regex);
			print();
		}
	}
}
