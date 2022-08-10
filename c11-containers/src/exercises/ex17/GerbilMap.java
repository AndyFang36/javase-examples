package exercises.ex17;

import exercises.ex01.Gerbil;

import java.util.*;

public class GerbilMap {
	public static void main(String[] args) {
		Map<String, Gerbil> map = new HashMap<>();
		map.put("Fuzzy", new Gerbil(1));
		map.put("Spot", new Gerbil(2));
		map.put("Joe", new Gerbil(3));
		map.put("Ted", new Gerbil(4));
		map.put("Heather", new Gerbil(5));
		for (Map.Entry<String, Gerbil> entry : map.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			entry.getValue().hop();
		}
	}
}
