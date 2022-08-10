package exercises.ex20;

import java.util.Locale;
import java.util.Scanner;

public class DataHolder {
	private int i;
	private long l;
	private float f;
	private double d;
	private String s;

	DataHolder(String data) {
		Scanner stdin = new Scanner(data);
		stdin.useLocale(Locale.US);
		i = stdin.nextInt();
		l = stdin.nextLong();
		f = stdin.nextFloat();
		d = stdin.nextDouble();
		s = stdin.next("\\w+");
	}

	@Override
	public String toString() {
		return i + " " + l + " " + f + " " + d + " " + s;
	}
}
