package examples.regular_expression._07_reset;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {
	public static void main(String[] args) {
		String text = "fix the rug with bags";
		String regEx = "[frb][aiu][gx]";
		Matcher m = Pattern.compile(regEx).matcher(text);
		while (m.find())
			System.out.print(m.group() + " ");
		System.out.println();
		m.reset("fix the rig with rags");
		while (m.find())
			System.out.print(m.group() + " ");
	}
}