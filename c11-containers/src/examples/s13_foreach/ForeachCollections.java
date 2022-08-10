package examples.s13_foreach;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForeachCollections {
	public static void main(String[] args) {
		Collection<String> cStr = new LinkedList<>();
		Collections.addAll(cStr,
			"Take the long way home".split(" ")
		);
		for (String tempS : cStr)
			System.out.print("\"" + tempS + "\" ");
	}
}
