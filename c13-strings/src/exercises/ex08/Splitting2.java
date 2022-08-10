package exercises.ex08;

import examples.regular_expression.basics.Splitting;

import java.util.Arrays;

public class Splitting2 {
	public static void split(String regex) {
		System.out.println(
			Arrays.toString(Splitting.knights.split(regex))
		);
	}

	public static void main(String[] args) {
		split("the|you");
	}
}
