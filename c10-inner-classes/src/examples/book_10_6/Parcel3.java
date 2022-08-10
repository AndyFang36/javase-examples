package examples.book_10_6;

public class Parcel3 {
	public Wrapping wrapping(int x) { // Base constructor call:
		return new Wrapping(x) { // Pass constructor argument.
			@Override
			public int value() {
				return super.value() * 47;
			}
		}; // Semicolon required
	}

	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		Wrapping w = p.wrapping(10);
		System.out.println(w.value());
	}
}
