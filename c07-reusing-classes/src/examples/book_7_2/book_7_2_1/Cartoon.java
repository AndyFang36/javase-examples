package examples.book_7_2.book_7_2_1;

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

public class Cartoon extends Drawing {
	private String s;

	public Cartoon() {
		print("Cartoon()");
		s = "Constructed";
	}
	public String toString(){
		return s;
	}

	public static void main(String[] args) {
		Cartoon x = new Cartoon();
		print(x);
	}
}
