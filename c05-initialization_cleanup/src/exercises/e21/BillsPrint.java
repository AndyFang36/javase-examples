package exercises.e21;

public class BillsPrint {
	public static void main(String[] args) {
		for (Bills b : Bills.values()) {
			System.out.println(b + " ordinal " + b.ordinal());
		}
	}
}
