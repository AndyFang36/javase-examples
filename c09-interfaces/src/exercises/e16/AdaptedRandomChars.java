package exercises.e16;

import java.nio.*;
import java.util.*;

class RandomChars {
	private static Random rand = new Random();

	public char next() {
		return (char) (rand.nextInt(26) + 97);
	}

	public static void main(String[] args) {
		RandomChars rc = new RandomChars();
		for (int i = 0; i < 26; i++)
			System.out.print(rc.next() + " ");
	}
}


public class AdaptedRandomChars extends RandomChars implements Readable {
	private int count;

	AdaptedRandomChars(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		String result = next() + " ";
		cb.append(result);
		return result.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomChars(26));
		while (s.hasNext())
			System.out.println(s.next() + " ");
	}
}
