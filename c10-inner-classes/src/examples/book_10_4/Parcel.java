package examples.book_10_4;

public class Parcel {
	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	private class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		@Override
		public String readLabel() {
			return label;
		}
	}

	public Contents contentsNew() {
		return new PContents();
	}

	public Destination destinationNew(String s) {
		return new PDestination(s);
	}
}
