package examples.Scanner;

import java.util.Scanner;

public class ScannerDelimiter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("12, 42, 78/99, 42 , 80,66\\97-56");
		scanner.useDelimiter("\\s*[-,/\\\\]\\s*");
		while (scanner.hasNextInt())
			System.out.println(scanner.nextInt());
	}
}