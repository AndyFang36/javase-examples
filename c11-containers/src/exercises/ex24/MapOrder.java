package exercises.ex24;

import net.mindview.util.Countries;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOrder {
	public static void main(String[] args) {
		Map<String, String> m1 = new LinkedHashMap<>(
			Countries.capitals(25)
		);
		System.out.println(m1);
		String[] keys = m1.keySet().toArray(new String[0]);
		Arrays.sort(keys);
		Map<String, String> m2 = new LinkedHashMap<>();
		for (String key : keys)
			m2.put(key, m1.get(key));
		System.out.println(m2);
	}
}
