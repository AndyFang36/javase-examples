package examples.s01_abstract;

public class Test {
	/* Doesn't care about type, so new types added to the system still work right: */
	static void tune(Instrument[] e) {
		for (Instrument i : e)
			i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tune(orchestra);
	}
}