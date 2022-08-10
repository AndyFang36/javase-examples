package examples.s01;

public class Parcel1 {
	static class Contents {
		private int i = 11;

		public int value() { return (this.i); }
	}

	static class Destination {
		private final String label;

		Destination(String whereTo) { this.label = whereTo; }

		String readLabel() { return (this.label); }
	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		Parcel1 parcel = new Parcel1();
		parcel.ship("Tasmania");
	}
}