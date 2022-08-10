package exercises.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RodentIteration {
	public static void main(String[] args) {
		ArrayList<Rodent> rodents = new ArrayList<>(
			Arrays.asList(
				new Rodent(),
				new Mouse(),
				new Hamster()
			)
		);
		Rodent r;
		for (Iterator<Rodent> it = rodents.iterator(); it.hasNext(); ) {
			r = it.next();
			r.hop();
			r.scurry();
			r.reproduce();
			System.out.println(r + "\n");
		}
	}
}
