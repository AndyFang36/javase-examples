package exercises.ex25;

import net.mindview.util.TextFile;

import java.util.*;

public class WordsInfo {
	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> state = new HashMap<>();
		int wordCount = 0;
		for (String word : new TextFile("temp.txt", "\\W+")) {
			ArrayList<Integer> loc = state.get(word);
			if (loc == null) {
				loc = new ArrayList<>();
				state.put(word, loc);
			}
			loc.add(++wordCount);
		}
		System.out.println(state);
	}
}
