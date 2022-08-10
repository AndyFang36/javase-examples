package examples.s13_foreach._01_adapter;

import static net.mindview.util.Print.*;

import java.util.Arrays;

public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<>(
			Arrays.asList("To be or not to be".split(" "))
		);
		// Grabs the ordinary iterator via iterator():
		for (String s : ral)
			printnb(s + " ");
		print();
		// Hand it the Iterable of your choice
		for (String s : ral.reversed())
			printnb(s + " ");
	}
}
