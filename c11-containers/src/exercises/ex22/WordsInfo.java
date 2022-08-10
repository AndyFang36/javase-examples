package exercises.ex22;

import net.mindview.util.TextFile;

import java.util.*;

public class WordsInfo {
	static void
	updateStat(Iterator<WordCounter> it, WordCounter wc) {
		while (it.hasNext()) {
			WordCounter currentWC = it.next();
			if (currentWC.equals(wc))
				currentWC.incFrequency();
		}
	}

	public static void main(String[] args) {
		Set<WordCounter> stat = new HashSet<>();
		for (String word : new TextFile("TIJ4.java", "\\W+")) {
			WordCounter wc = new WordCounter(word);
			if (stat.contains(wc))
				updateStat(stat.iterator(), wc);
			else
				stat.add(wc);
		}
		List<WordCounter> newStat = new ArrayList<>(stat);
		newStat.sort(WordCounter.CASE_INSENSITIVE_ORDER);
		for (WordCounter wc : newStat)
			System.out.println(wc.getWord() + " => " + wc.getFrequency());
	}
}
