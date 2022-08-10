package exercises.ex04;

import net.mindview.util.Generator;

import java.util.Arrays;
import java.util.Collection;

public class MovieNameGenerator implements Generator<String> {
	private int index = 0;
	private static final String[] characters = {
		"Grumpy", "Happy", "Sleepy", "Dopey", "Doc",
		"Sheeny", "Bashful", "Snow White", "Witch Queen", "Prince"
	};

	public static void fill(Collection<String> c) {
		c.addAll(Arrays.asList(characters));
	}

	@Override
	public String next() {
		String s = characters[index];
		index = (index + 1) % characters.length;
		return s;
	}
}
