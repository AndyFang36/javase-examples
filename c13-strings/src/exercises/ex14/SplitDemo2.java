package exercises.ex14;

import java.util.Arrays;

import static net.mindview.util.Print.*;

public class SplitDemo2 {
	public static void main(String[] args) {
		String input = "This!!unusual use!!of exclamation!!points";
		print(Arrays.toString(input.split("!!")));
		print(Arrays.toString(input.split("!!", 3)));
	}
}
