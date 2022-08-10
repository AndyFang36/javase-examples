package examples.book_10_3;

public class DotThis {
	void f() {
		System.out.println("dotThis.f()");
	}

	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}

	public Inner newInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		Inner dti = dt.newInner();
		dti.outer().f();
	}
}
