package examples.regular_expression.basics;

import java.util.Arrays;

public class Splitting {
	public static String knights =
		"Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... " +
		"with... a herring!";
	public static void split(String regEx){
		System.out.println(Arrays.toString(knights.split(regEx)));
	}

	public static void main(String[] args) {
		split(" ");  // doesn't have to contain regex chars
		split("\\W+");  // non-word characters
		split("\\W+ ");  // 'n' followed by non-word characters
	}
}