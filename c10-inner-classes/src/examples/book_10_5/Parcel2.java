package examples.book_10_5;

public class Parcel2 {
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String s;

				TrackingSlip(String tempS) {
					s = tempS;
				}

				String getSlip() {
					return s;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			System.out.println(ts.getSlip());
		}
		// Can’t use it here! Out of scope:
		//! TrackingSlip ts = new TrackingSlip("x");
	}

	public void track(boolean temp) {
		internalTracking(temp);
	}

	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.track(true);
	}
}
