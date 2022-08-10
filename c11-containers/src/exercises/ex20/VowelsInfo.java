package exercises.ex20;

import net.mindview.util.TextFile;

import static net.mindview.util.Print.*;

import java.util.*;

public class VowelsInfo {
	private static final Set<Character> vowels = new HashSet<>(
		Arrays.asList(
			'a', 'e', 'i', 'o', 'u',
			'A', 'E', 'I', 'O', 'U'
		)
	);

	private static void updateStat(Map<Character, Integer> tempStat, char letter) {
		Character ch = Character.toLowerCase(letter);
		Integer freq = tempStat.get(ch);
		tempStat.put(ch, freq == null ? 1 : freq + 1);
	}

	public static void main(String[] args) {
		Map<Character, Integer> wordStat = new HashMap<>();
		Map<Character, Integer> fileStat = new HashMap<>();
		Set<String> processedWords = new HashSet<>();
		String[] file = (String[]) new TextFile(
			"TIJ4.java", "\\W+"
		).toArray();
		for (String word : file) {
			wordStat.clear();
			for (char letter : word.toCharArray()) {
				if (vowels.contains(letter)) {
					updateStat(wordStat, letter);
					updateStat(fileStat, letter);
				}
			}
			if (!processedWords.contains(word)) {
				processedWords.add(word);
				print("Vowels in \"" + word + "\": " + wordStat);
			}
		}
		print("***********************************************");
		print("fileStat.keySet() = " + fileStat.keySet());
		SortedSet<Character> keys = new TreeSet<>(fileStat.keySet());
		Map<Character, Integer> sortedFileStat = new HashMap<>();
		for (Character tempKey : keys) {
			sortedFileStat.put(tempKey, fileStat.get(tempKey));
		}
		print("Vowels in the whole file: " + sortedFileStat);
	}
}
