package examples.s08.book_10_8_1;

class Callee1 implements Incremental {
	private int i = 0;

	@Override
	public void increment() {
		++i;
		System.out.println(i);
	}
}
