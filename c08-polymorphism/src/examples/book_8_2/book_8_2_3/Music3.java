package examples.book_8_2.book_8_2_3;

import examples.s01_up_casting.Note;

import static net.mindview.util.Print.*;

class Instrument {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		print("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		print("Wind.play() " + n);
	}

	String what() {
		return "Wind";
	}

	void adjust() {
		print("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		print("Percussion.play() " + n);
	}

	String what() {
		return "Percussion";
	}

	void adjust() {
		print("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		print("Stringed.play() " + n);
	}

	String what() {
		return "Stringed";
	}

	void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		print("Brass.play() " + n);
	}

	void adjust() {
		print("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}

	String what() {
		return "Woodwind";
	}
}

public class Music3 {
	// Dosen’t care about type, so new types
	// added to the system still work right:
	public static void tuneAll(Instrument[] i) {
		for (Instrument temp : i)
			temp.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		// Up casting during addition to the array:
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
}
