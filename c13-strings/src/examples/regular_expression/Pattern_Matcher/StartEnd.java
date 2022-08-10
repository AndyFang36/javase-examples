package examples.regular_expression.Pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.*;

public class StartEnd {
	public static String text
		= "As long as there is injustice, whenever a\n" +
		"Targathian baby cries out, wherever a distress\n" +
		"signal sounds among the stars ... We’ll be there.\n" +
		"This fine ship, and this fine crew ...\n" +
		"Never give up! Never surrender!";

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
				print(msg);
			}
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
			"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!"
		};
		for (String in : text.split("\n")) {
			print("input : " + in);
			for (String regex : regExs)
				examine(in, regex);
			print();
		}
	}
}
