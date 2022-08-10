package exercises.e17;

class Cycle {
	private String name = "Cycle";

	static void travel(Cycle c) {
		System.out.println("Cycle.ride() " + c);
	}

	@Override
	public String toString() {
		return this.name;
	}
}

class Unicycle extends Cycle {
	private String name = "Unicycle";

	protected void balance() {
		System.out.println("Balance Unicycle");
	}

	@Override
	public String toString() {
		return this.name;
	}
}

class Bicycle extends Cycle {
	private String name = "Bicycle";

	protected void balance() {
		System.out.println("Balance Bicycle");
	}

	@Override
	public String toString() {
		return this.name;
	}

}

class Tricycle extends Cycle {
	private String name = "Tricycle";

	@Override
	public String toString() {
		return this.name;
	}
}

public class BikingEx {
	public static void main(String[] args) {
		Cycle[] ride = {
				new Unicycle(),
				new Bicycle(),
				new Tricycle(),
		};
		// Compile time error:
		// cannot find balance() method in Cycle:
		//! for(Cycle c : ride) {
		//!	c.balance();
		//! }
		((Unicycle) ride[0]).balance();
		((Bicycle) ride[1]).balance();
		// Compile time error:
		// no balance() in Tricycle:
		//! ((Tricycle)ride[2]).balance();
		// RTTI: ClassCastException:
		// Tricycle cannot be cast to Bicycle:
		//! ((Bicycle)ride[2]).balance();
	}
}
