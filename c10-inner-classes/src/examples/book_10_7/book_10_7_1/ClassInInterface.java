package examples.book_10_7.book_10_7_1;

public interface ClassInInterface {
	void howdy();

	class Test implements ClassInInterface {
		@Override
		public void howdy() {
			System.out.println("Howdy!");
		}

		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}
