package exercises.e23;

class A {
	U getU() {
		return new U() {
			@Override
			public void f() {
				System.out.print("A.f() ");
			}

			@Override
			public void g() {
				System.out.print("A.g() ");
			}

			@Override
			public void h() {
				System.out.print("A.h() ");
			}
		};
	}
}
