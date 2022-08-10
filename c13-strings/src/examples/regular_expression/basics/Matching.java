package examples.regular_expression.basics;

import static net.mindview.util.Print.*;

public class Matching {
	private static int num;

	private static void ifMatch(boolean b) {
		print(num + ": " + b);
		++num;
	}

	public static void main(String[] args) {
		ifMatch("123".matches("\\d"));
		ifMatch("-123".matches("-?\\d+"));
		ifMatch("456".matches("-?\\d+"));
		ifMatch("+911".matches("-?\\d+"));
		ifMatch("+911".matches("(-|\\+)?\\d+"));
		ifMatch("+911".matches("([-+])?\\d+"));
		ifMatch("\\1234".matches("\\\\(\\d+)"));
	}
}