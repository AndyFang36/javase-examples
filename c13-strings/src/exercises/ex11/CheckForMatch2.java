package exercises.ex11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForMatch2 {

	public static void main(String[] args) {
		String regEx
			= "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		String source
			= "Arline ate eight apples and" +
			"one orange while Anita hadn't any";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(source);
		if (m.find()) {
			System.out.print("Match \"" + m.group() + "\" ");
			System.out.println("at positions " + m.start() + "-" + (m.end() - 1));
		}
	}
}
