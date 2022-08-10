package examples.book_8_5.book_8_5_2;

class Useful {
	protected void f() {
		System.out.println("Useful.f()");
	}

	protected void g() {
		System.out.println("Useful.g()");
	}
}

class MoreUseful extends Useful {
	@Override
	protected void f() {
		System.out.println("MoreUseful.f()");
	}

	@Override
	protected void g() {
		System.out.println("MoreUseful.g()");
	}

	protected void u() {
		System.out.println("MoreUseful.u()");
	}

	protected void v() {
		System.out.println("MoreUseful.v()");
	}

	protected void w() {
		System.out.println("MoreUseful.w()");
	}
}

public class RTTI {
	public static void main(String[] args) {
		Useful[] x = {
				new Useful(),
				new MoreUseful()
		};
		x[0].f();
		x[0].g();
		x[1].f();
		x[1].g();
		// compile time:
		// method not found in Useful:
		//! x[1].u();
		((MoreUseful) x[0]).u();
		((MoreUseful) x[1]).u();
	}
}
