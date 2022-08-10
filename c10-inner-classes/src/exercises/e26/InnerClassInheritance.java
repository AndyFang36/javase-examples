package exercises.e26;

class Default {
	class Inner {
		int i;

		public Inner(int i) {
			this.i = i;
		}

		public Inner() {
			i = 47;
		}

		public void f() {
			System.out.println("Inner.f()");
		}
	}
}

public class InnerClassInheritance {
	class Inner2 extends Default.Inner {
		// Won't compile -- Default not available:
		//! public Inner2(int i) {
		//! super(i);
		//! }
		public Inner2(Default d, int i) {
			d.super(i);
		}

		@Override
		public void f() {
			super.f();
			System.out.println("Inner2.f()");
		}
	}

	public static void main(String[] args) {
		Default d = new Default();
		InnerClassInheritance ici = new InnerClassInheritance();
		Inner2 i2 = ici.new Inner2(d, 47);
		i2.f();
	}
}
