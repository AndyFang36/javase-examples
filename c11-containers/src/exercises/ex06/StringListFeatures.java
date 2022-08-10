package exercises.ex06;

import java.util.*;

import static net.mindview.util.Print.*;

public class StringListFeatures {
	private static final Random rand = new Random(47);

	public static void main(String[] args) {
		List<String> str = new ArrayList<>(
			Arrays.asList("A", "B", "C", "D", "E", "F", "G")
		);
		print("1: " + str);
		str.add("H");
		print("2: " + str);
		print("3: " + str.contains("H"));
		str.remove("H");
		String s1 = str.get(2);
		print("4: " + s1 + " " + str.indexOf(s1));
		String s2 = "A";
		print("5: " + str.indexOf(s2));
		print("6: " + str.remove(s2));
		print("7: " + str.remove(s1));
		print("8: " + str);
		str.add(3, "0");
		print("9: " + str);
		List<String> sub = str.subList(1, 4);
		print("subList: " + sub);
		print("10: " + str.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("11: " + str.containsAll(sub));
		Collections.shuffle(sub, rand);
		print("shuffled subList: " + sub);
		print("12: " + str.containsAll(sub));
		List<String> copy = new ArrayList<>(str);
		sub = Arrays.asList(str.get(1), str.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<>(str);
		copy.remove(2);
		print("14: " + copy);
		copy.removeAll(sub);
		print("15: " + copy);
		copy.set(1, "I");
		print("16: " + copy);
		copy.addAll(2, sub);
		print("17: " + copy);
		print("18: " + str.isEmpty());
		str.clear();
		print("19: " + str);
		print("20: " + str.isEmpty());
		str.addAll(Arrays.asList("A", "B", "C", "D"));
		print("21: " + str);
		Object[] o = str.toArray();
		print("22: " + o[3]);
		String[] sa = str.toArray(new String[0]);
		print("22: " + sa[3]);
	}
}
