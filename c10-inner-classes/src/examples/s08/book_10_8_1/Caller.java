package examples.s08.book_10_8_1;

class Caller {
	private final Incremental callbackReference;

	Caller(Incremental cbh) {
		callbackReference = cbh;
	}

	void go() {
		callbackReference.increment();
	}
}
