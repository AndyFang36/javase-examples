package examples.s10_map;

import java.util.*;

public class Statistics {
	private static final Random rand = new Random(47);

	public static void main(String[] args) {
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < 1000; i++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
	}
}
