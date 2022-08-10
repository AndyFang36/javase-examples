package examples.s02;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> integers = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			integers.add(i);
		for (Integer temp : integers)
			System.out.print(temp + " ");
	}
}