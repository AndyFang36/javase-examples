package exercises.e13;

class ThreeWay {
	void number(byte b) {
		System.out.println(b);
	}

	void number(short s) {
		System.out.println(s);
	}

	void number(int i) {
		System.out.println(i);
	}
}

class Overload extends ThreeWay {
	void number(float f) {
		System.out.println(f);
	}

	public static void main(String[] args) {
		Overload ov = new Overload();
		ov.number((byte) 0);
		ov.number((short) 1);
		ov.number(2);
		ov.number(3.0f);
	}
}
