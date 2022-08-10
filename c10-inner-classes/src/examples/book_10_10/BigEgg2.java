package examples.book_10_10;

import static net.mindview.util.Print.*;

class Egg2 {
	protected class Yolk {
		public Yolk() {
			print("Egg2.Yolk()");
		}

		public void f() {
			print("Egg2.Yolk.f()");
		}
	}

	private Yolk yolk = new Yolk();

	public Egg2() {
		print("new egg2");
	}

	public void insertYolk(Yolk yy) {
		yolk = yy;
	}

	public void g() {
		yolk.f();
	}
}

public class BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			print("BigEgg2.Yolk()");
		}

		@Override
		public void f() {
			print("BigEgg2.Yolk.f()");
		}
	}

	public BigEgg2() {
		insertYolk(new Yolk());
	}

	public static void main(String[] args) {
		Egg2 egg2 = new BigEgg2();
		egg2.g();
	}
}
