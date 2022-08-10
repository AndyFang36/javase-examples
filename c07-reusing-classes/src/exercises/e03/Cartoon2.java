package exercises.e03;

import static net.mindview.util.Print.*;

class Art {
	Art() {
		print("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		print("Drawing constructor");
	}
}

public class Cartoon2 extends Drawing {
	private String s;

	public Cartoon2() {
		print("Cartoon()");
		s = "Constructed";
	}
	public String toString(){
		return s;
	}

	public static void main(String[] args) {
		Cartoon2 x = new Cartoon2();
		print(x);
	}
}
