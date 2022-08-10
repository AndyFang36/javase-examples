package examples.StringTokenizer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo {
	static String text = "But I'm not dead yet! I feel happy!";

	public static void main(String[] args) {
		StringTokenizer stoke = new StringTokenizer(text);
		while (stoke.hasMoreElements())
			System.out.print(stoke.nextToken() + " ");
		System.out.println("\n---------------------------------------------------------------------------------------");
		System.out.println(Arrays.toString(text.split(" ")));
		System.out.println("-----------------------------------------------------------------------------------------");
		Scanner scanner = new Scanner(text);
		while (scanner.hasNext())
			System.out.print(scanner.next() + " ");
	}
}