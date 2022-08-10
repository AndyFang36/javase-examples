package examples.book_10_4;

public class ParcelTest {
	public static void main(String[] args) {
		Parcel pTest = new Parcel();
		Contents c = pTest.contentsNew();
		Destination d = pTest.destinationNew("Tasmania");
		// Illegal -- can’t access private class:
		//! Parcel.PContents pc = p.new PContents();
		System.out.println(c.value());
		System.out.println(d.readLabel());
	}
}
