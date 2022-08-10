package examples.regular_expression.Pattern_Matcher;

import static net.mindview.util.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
		while (m.find()) printnb(m.group() + " ");
		print();
		int i = 0;
		while (m.find(i)) {
			printnb(m.group() + " ");
			++i;
		}
	}
}