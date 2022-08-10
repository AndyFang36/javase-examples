package examples.regular_expression._08_io;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.*;

public class JGrep2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[Ssct]\\w+");
		int index = 0;
		Matcher m = p.matcher("");
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
