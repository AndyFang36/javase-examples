package exercises.ex23;

import java.util.*;
import java.util.Map.Entry;

public class MoreProbable {
	private static final Random rand = new Random(47);

	public static void main(String[] args) {
		Map<Integer, Counter> m = new HashMap<>();
		for (int i = 0; i < 1000000; i++) {
			int r = rand.nextInt(100);
			if (!m.containsKey(r))
				m.put(r, new Counter());
			else
				m.get(r).i++;
		}
		//
		List<HistoryUnit> lst = new ArrayList<>();
		for (Entry<Integer, Counter> entry : m.entrySet()) {
			lst.add(
				new HistoryUnit(
					entry.getValue(), entry.getKey()
				)
			);
		}
		Collections.sort(lst);
		System.out.println("lst = " + lst);
	}
}
