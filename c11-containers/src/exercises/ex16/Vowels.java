package exercises.ex16;

import net.mindview.util.TextFile;

import static net.mindview.util.Print.*;

import java.util.*;


public class Vowels {
	private static final Set<Character> vowels = new HashSet<>(
		Arrays.asList(
			'a', 'e', 'i', 'o', 'u',
			'A', 'E', 'I', 'O', 'U'
		)
	);

	public static void main(String[] args) {
		HashSet<String> processedWords = new HashSet<>();
		int fileVowels = 0;
		int wordVowels;
		for (String word : new TextFile("TIJ4.java", "\\W+")) {
			wordVowels = 0;
			for (char letter : word.toCharArray())
				if (vowels.contains(letter))
					wordVowels++;
			if (!processedWords.contains(word)) {
				processedWords.add(word);
				printnb(word + " has " + wordVowels);
				if (wordVowels == 1)
					print(" vowel");
				else
					print(" vowels");
			}
			fileVowels += wordVowels;
		}
		print("Total number of vowels in file: " + fileVowels);
	}
}
