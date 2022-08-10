package examples.s09_set;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<>(
			new TextFile("TIJ4.java", "\\W+")
		);
		System.out.println(words);
	}
}
