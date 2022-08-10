package exercises.ex26;

import net.mindview.util.TextFile;

import java.util.*;
import java.util.Map.Entry;

public class WordsInfo {
	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> status = new HashMap<>();
		int wordCount = 0;
		List<String> originalWords
			= new TextFile("temp.txt", "\\W+");
		for (String word : originalWords) {
			ArrayList<Integer> loc = status.get(word);
			if (loc == null) {
				loc = new ArrayList<>();
				status.put(word, loc);
			}
			loc.add(++wordCount);
		}
		// Now recreate the original order of the words.
		// We will use an inverted structure, where the key
		// is the position of the word in the file. Also,
		// we will sort words based on their positions.
		TreeMap<Integer, String> sortedWords = new TreeMap<>();
		for (Entry<String, ArrayList<Integer>> entry : status.entrySet())
			for (Integer pos : entry.getValue())
				sortedWords.put(pos, entry.getKey());
		// Test the correctness.
		System.out.println(originalWords);
		System.out.println(sortedWords.values());
	}
}
