package examples.book_10_3;

public class Parcel {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public static void main(String[] args) {
		Parcel p = new Parcel();
		Contents c = p.new Contents();
		Destination d = p.new Destination("Tasmania");
	}
}
