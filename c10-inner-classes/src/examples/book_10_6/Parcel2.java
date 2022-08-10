package examples.book_10_6;

import examples.book_10_4.Contents;

public class Parcel2 {
	class MyContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	public Contents contents() {
		return new MyContents();
	}

	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		Contents c = p.contents();
	}
}
