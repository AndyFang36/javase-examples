package examples.book_10_6;

import examples.book_10_4.Contents;

public class Parcel {
	public Contents contentsNew() {
		return new Contents() { // Insert a class definition
			private int i = 11;

			@Override
			public int value() {
				return i;
			}
		}; // Semicolon required in this case
	}

	public static void main(String[] args) {
		Parcel p = new Parcel();
		Contents c = p.contentsNew();
	}
}
