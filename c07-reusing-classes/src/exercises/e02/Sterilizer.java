package exercises.e02;

import examples.book_7_2.Detergent;

import static net.mindview.util.Print.*;

public class Sterilizer extends Detergent {
	public void scrub() {
		append(" Sterilizer.scrub()");
	}

	public void sterilize() {
		append(" sterilize()");
	}

	public static void main(String[] args) {
		Sterilizer s = new Sterilizer();
		s.dilute();
		s.apply();
		s.scrub();
		s.foam();
		s.sterilize();
		print(s);
		print("Testing base class:");
		Detergent.main(args);
	}
}
