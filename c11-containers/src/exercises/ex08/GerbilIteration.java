package exercises.ex08;

import exercises.ex01.Gerbil;

import java.util.ArrayList;
import java.util.Iterator;

public class GerbilIteration {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			gerbils.add(new Gerbil(i));
		for (Iterator<Gerbil> it = gerbils.iterator(); it.hasNext(); it.next().hop()) ;
	}
}
