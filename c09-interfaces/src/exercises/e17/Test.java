package exercises.e17;

interface Days {
	int //static final
		SUNDAY = 1,
		MONDAY = 2,
		TUESDAY = 3,
		WEDNESDAY = 4,
		THURSDAY = 5,
		FRIDAY = 6,
		SATURDAY = 7;
}

class Week implements Days {
	private static int count = 0;

	Week() {
		System.out.println("Week() " + count++);
	}
}

public class Test {
	public static void main(String[] args) {
		// Without any objects, static fields exist:
		System.out.println("SUNDAY = " + Days.SUNDAY);
		System.out.println("MONDAY = " + Days.MONDAY);
		Week w0 = new Week();
		Week w1 = new Week();
		// Error: cannot assign a value to final variable SUNDAY:
		//! w0.SUNDAY = 2;
		// Error: cannot assign a value to final variable MONDAY:
		//! w1.MONDAY = w0.MONDAY;
	}
}