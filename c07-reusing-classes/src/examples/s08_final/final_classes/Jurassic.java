package examples.s08_final.final_classes;

class SmallBrain {
	void f() {
		System.out.println("f()");
	}
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();

	void g() {
		System.out.println("g()");
	}
}

//! class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur d = new Dinosaur();
		System.out.println(d.i = 47);
		System.out.println(d.j++);
		d.x.f();
		d.g();
	}
}
