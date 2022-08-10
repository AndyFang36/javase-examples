package exercises.ex09;

import examples.regular_expression.basics.Splitting;

import java.util.*;

public class Replacing2 {
	static char[] original = Splitting.knights.toCharArray();

	public static void main(String[] args) {
		//way1:
		String replaced1 =
			Splitting.knights.replaceAll("(?i)[aeiou]", "_");
		System.out.println(replaced1);
		// way2:
		char[] replaced2 = new char[original.length];
		for (int i = 0; i < original.length; i++) {
			switch (original[i]) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					replaced2[i] = '_';
					break;
				default:
					replaced2[i] = original[i];
			}
		}
		System.out.println(replaced2);
		// way3:
		Set<Character> vowels = new HashSet<>(
			Arrays.asList(
				'a', 'e', 'i', 'o', 'u'
			)
		);
		StringBuilder replaced3 = new StringBuilder();
		for (char c : original) {
			if (vowels.contains(c))
				replaced3.append('_');
			else
				replaced3.append(c);
		}
		System.out.println(replaced3);
	}
}
