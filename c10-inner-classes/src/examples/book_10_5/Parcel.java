package examples.book_10_5;

import examples.book_10_4.Destination;

public class Parcel {
	public Destination destinationNew(String s) {
		class PDestination implements Destination {
			private String label;

			private PDestination(String whereTo) {
				label = whereTo;
			}

			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}

	public static void main(String[] args) {
		Parcel p = new Parcel();
		Destination d = p.destinationNew("Tasmania");
		System.out.println(d.readLabel());
	}
}
