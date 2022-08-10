package exercises.e14;

interface History {
	void u();

	void v();
}

interface Exam {
	void w();

	void x();
}

interface Labs {
	void y();

	void z();
}

interface Workup extends History, Exam, Labs {
	void zz();
}

class Doctor {
	private int i = 0;

	public void doc() {
	}
}

class Anesthesiologist extends Doctor implements Workup {
	private int j = 0;

	public void u() {
	}

	public void v() {
	}

	public void w() {
	}

	public void x() {
	}

	public void y() {
	}

	public void z() {
	}

	public void zz() {
	}
}

public class Test {
	public static void m1(History history) {
		history.v();
	}

	public static void m2(Exam exam) {
		exam.w();
	}

	public static void m3(Labs labs) {
		labs.y();
	}

	public static void m4(Workup workup) {
		workup.zz();
	}

	public static void main(String[] args) {
		Anesthesiologist x = new Anesthesiologist();
		m1(x);
		m2(x);
		m3(x);
		m4(x);
	}
}