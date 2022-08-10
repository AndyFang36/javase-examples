package examples.book_7_4.book_7_4_2;

import static net.mindview.util.Print.*;

class Homer {
	char doh(char c) {
		print("doh(char)");
		return 'd';
	}

	float doh(float f) {
		print("doh(float)");
		return 1.0f;
	}
}

class Bird {
}

class Bart extends Homer {
	void doh(Bird m) {
		print("doh(Bird)");
	}
}

public class Hide {
	public static void main(String[] args) {
		Bart bart = new Bart();
		bart.doh(1);
		bart.doh('x');
		bart.doh(3.14F);
		bart.doh(new Bird());
	}
}
