package exercises.e08;

class Outer {
	class Inner {
		private int in1 = 1;
		private int in2 = 2;

		private void showIn2() {
			System.out.println(in2);
		}

		private void hello() {
			System.out.println("Inner hello");
		}
	}

	// Need to create objects to access private elements of Inner:
	int outI = new Inner().in1;

	void showOutI() {
		System.out.println(outI);
	}

	void showIn2() {
		new Inner().showIn2();
	}

	void showHello() {
		new Inner().hello();
	}

	public static void main(String[] args) {
		Outer out = new Outer();
		out.showOutI();
		out.showIn2();
		out.showHello();
	}
}
