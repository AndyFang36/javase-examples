package exercises.e10;

import static net.mindview.util.Print.*;

import others.Note;

interface Instrument {
	// Compile-time constant:
	int VALUE = 5; // static and final

	// Cannot have method definitions:
	void adjust();
}

interface Playable {
	void play(Note n); // Automatically public
}

class Wind implements Instrument, Playable {
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	@Override
	public String toString() {
		return "Wind";
	}

	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion implements Instrument, Playable {
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	@Override
	public String toString() {
		return "Percussion";
	}

	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed implements Instrument, Playable {
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	@Override
	public String toString() {
		return "Stringed";
	}

	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind {
	@Override
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	@Override
	public String toString() {
		return "Woodwind";
	}
}

public class Music {
	// Doesn't care about type, so new types
	// added to the system will work right:
	static void tune(Playable[] e) {
		for (Playable p : e)
			p.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tune(orchestra);
	}
}