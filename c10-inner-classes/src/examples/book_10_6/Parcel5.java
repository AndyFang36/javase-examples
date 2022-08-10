package examples.book_10_6;

import examples.book_10_4.Destination;

public class Parcel5 {
	public Destination destinationNew(final String dest, final float price) {
		return new Destination() {
			private int cost;

			// Instance initialization for each object:
			{
				cost = Math.round(price);
				if (cost > 100)
					System.out.println("Over budget!");
			}

			private String label = dest;

			@Override
			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destinationNew("Tasmania", 101.395F);
	}
}
