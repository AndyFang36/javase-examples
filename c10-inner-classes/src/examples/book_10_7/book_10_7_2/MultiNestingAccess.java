package examples.book_10_7.book_10_7_2;

class MNA {
	private void f() {
		System.out.println("MNA.f()");
	}

	class A {
		private void g() {
			System.out.println("A.g()");
		}

		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}

public class MultiNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaA = mna.new A();
		MNA.A.B mnaAB = mnaA.new B();
		mnaAB.h();
	}
}
