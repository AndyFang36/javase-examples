package exercises.e22;

import exercises.e21.Bills;

public class BillsInfo {
	Bills kind;

	BillsInfo(Bills kind) {
		this.kind = kind;
	}

	void describe() {
		System.out.println("Some information: ");
		switch (kind) {
			case ONE:
				System.out.println("$1");
				break;
			case FIVE:
				System.out.println("$5");
				break;
			case TEN:
				System.out.println("$10");
				break;
			case TWENTY:
				System.out.println("$20");
				break;
			case FIFTY:
				System.out.println("$50");
				break;
			case HUNDRED:
				System.out.println("$100");
				break;
			default:
				System.out.println("error");
		}
	}

	public static void main(String[] args) {
		BillsInfo bill1 = new BillsInfo(Bills.ONE),
				bill2 = new BillsInfo(Bills.FIVE),
				bill3 = new BillsInfo(Bills.TEN),
				bill4 = new BillsInfo(Bills.TWENTY),
				bill5 = new BillsInfo(Bills.FIFTY),
				bill6 = new BillsInfo(Bills.HUNDRED);
		bill1.describe();
		bill2.describe();
		bill3.describe();
		bill4.describe();
		bill5.describe();
		bill6.describe();
	}
}
