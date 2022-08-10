package exercises.ex22;

import java.util.*;

class WordCounter {
	public static final
	Comparator<WordCounter> CASE_INSENSITIVE_ORDER = new Comparator<>() {
		@Override
		public int compare(WordCounter o1, WordCounter o2) {
			return o1.word.compareToIgnoreCase(o2.word);
		}
	};
	private final String word;
	private int frequency;

	WordCounter(String word) {
		this.word = word;
		frequency = 1;
	}

	void incFrequency() {
		++frequency;
	}

	String getWord() {
		return word;
	}

	int getFrequency() {
		return frequency;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof WordCounter && word.equals(((WordCounter) o).word);
	}

	@Override
	public int hashCode() {
		return word.hashCode();
	}
}
