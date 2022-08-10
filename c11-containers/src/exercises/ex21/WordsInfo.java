package exercises.ex21;

import net.mindview.util.TextFile;

import java.util.*;

public class WordsInfo {
	public static void main(String[] args) {
		Map<String, Integer> wordsStat = new HashMap<>();
		for (String word : new TextFile("TIJ4.java", "\\W+")) {
			Integer freq = wordsStat.get(word);
			wordsStat.put(word, freq == null ? 1 : freq + 1);
		}
		List<String> keys = new ArrayList<>(
			wordsStat.keySet()
		);
		keys.sort(String.CASE_INSENSITIVE_ORDER);
		for (String key : keys)
			System.out.println(key + " => " + wordsStat.get(key));
	}
}
