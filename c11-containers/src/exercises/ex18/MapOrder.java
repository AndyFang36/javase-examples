package exercises.ex18;

import net.mindview.util.Countries;

import static net.mindview.util.Print.*;

import java.util.*;

public class MapOrder {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>(
			Countries.capitals(25)
		);
		print(m1);
		String[] keys = (String[]) m1.keySet().toArray();
		Arrays.sort(keys);
		Map<String, String> m2 = new LinkedHashMap<>();
		for (String key : keys)
			m2.put(key, m1.get(key));
		print(m2);
	}
}
