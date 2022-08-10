package examples.regular_expression.spliting;

import java.util.Arrays;
import java.util.regex.Pattern;

import static net.mindview.util.Print.*;

public class Demo {
	public static void main(String[] args) {
		String input = "This!!unusual use!!of exclamation!!points";
		print(Arrays.toString(Pattern.compile("!!").split(input)));
		print(Arrays.toString(Pattern.compile("!!").split(input, 3)));  // Only do the first three.
	}
}