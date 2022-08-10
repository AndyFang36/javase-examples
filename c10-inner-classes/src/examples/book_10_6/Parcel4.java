package examples.book_10_6;

import examples.book_10_4.Destination;

public class Parcel4 {
	// Argument must be final to use inside // anonymous inner class:
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;

			@Override
			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Destination d = p.destination("Tasmania");
		System.out.println(d.readLabel());
	}
}
