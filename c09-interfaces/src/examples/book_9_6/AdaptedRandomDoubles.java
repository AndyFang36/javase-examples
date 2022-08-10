package examples.book_9_6;

import java.nio.CharBuffer;
import java.util.*;

class RandomDoubles {
	private static final Random r = new Random(47);

	public double makeNew() {
		return r.nextDouble();
	}

	public static void main(String[] args) {
		RandomDoubles rd = new RandomDoubles();
		for (int i = 0; i < 7; i++) {
			System.out.println(rd.makeNew() + " ");
		}
	}
}

public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
	private int count;

	AdaptedRandomDoubles(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) {
		if (--count == 0)
			return -1;
		String result = makeNew() + " ";
		cb.append(result);
		return result.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		while (s.hasNextDouble())
			System.out.println(s.nextDouble() + " ");
	}
}
