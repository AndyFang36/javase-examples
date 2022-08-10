package exercises.e09;

import static net.mindview.util.Print.*;

import others.Note;

abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String toString() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	@Override
	public void adjust() {
		print(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Wind";
	}
}

class Percussion extends Instrument {
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

class Stringed extends Instrument {
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
	// Dosen’t care about type, so new types
	// added to the system still work right:
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
