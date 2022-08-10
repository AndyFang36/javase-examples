package examples.book_10_3;

public class DotNew {
	public class Inner {
		public Inner() {
			System.out.println("Inner()");
		}
	}

	public static void main(String[] args) {
		DotNew dn = new DotNew();
		Inner inner = dn.new Inner();
	}
}
