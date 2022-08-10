package exercises.ex12;

import examples.regular_expression.Pattern_Matcher.Groups;

import static net.mindview.util.Print.*;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups2 {
	public static void main(String[] args) {
		Set<String> words = new HashSet<>();
		String regEx = "\\b((?![A-Z])\\w+)\\b";
		Matcher m = Pattern.compile(regEx).matcher(Groups.POEM);
		while (m.find())
			words.add(m.group(1));
		print("Number of unique words = " + words.size());
		print(words.toString());
	}
}
