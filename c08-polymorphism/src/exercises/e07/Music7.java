package exercises.e07;

import examples.s01_up_casting.Note;

import static net.mindview.util.Print.*;

class Instrument {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	void adjust() {
		print("Adjusting Instrument");
	}

	public String toString() {
		return "Instrument";
	}
}

class Wind extends Instrument {
	void play(Note n) {
		print("Wind.play() " + n);
	}

	public String toString() {
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

	public String toString() {
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

	public String toString() {
		return "Stringed";
	}

	void adjust() {
		print("Adjusting Stringed");
	}
}

class Keyboard extends Instrument {
	void play(Note n) {
		print("Keyboard.play() " + n);
	}

	public String toString() {
		return "Keyboard";
	}

	void adjust() {
		print("Adjusting Keyboard");
	}
}

class Brass extends Wind {
	void play(Note n) {
		print("Brass.play() " + n);
	}

	public String toString() {
		return "Brass";
	}

	void adjust() {
		print("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}

	public String toString() {
		return "Woodwind";
	}
}

class Piano extends Keyboard {
	void play(Note n) {
		print("Piano.play() " + n);
	}

	public String toString() {
		return "Piano";
	}
}

public class Music7 {
	// Doesn't care about type, so new types
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
				new Keyboard(),
				new Brass(),
				new Woodwind(),
				new Piano()
		};
		tuneAll(orchestra);
		for (Instrument temp : orchestra)
			System.out.println(temp);
	}
}
