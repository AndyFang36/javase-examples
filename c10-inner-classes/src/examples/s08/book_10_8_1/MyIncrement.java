package examples.s08.book_10_8_1;

class MyIncrement {
	public void increment() {
		System.out.println("Other operation");
	}

	static void f(MyIncrement mi) {
		mi.increment();
	}
}
