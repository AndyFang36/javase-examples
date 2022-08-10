package exercises.e05;

class Cycle {
	private String name = "Cycle";
	private int wheels = 0;

	static void travel(Cycle c) {
		System.out.println("Cycle.ride() " + c);
	}

	protected int wheels() {
		return wheels;
	}

	public String toString() {
		return this.name;
	}
}

class Unicycle extends Cycle {
	private String name = "Unicycle";
	private int wheels = 1;

	@Override
	public int wheels() {
		return wheels;
	}

	public String toString() {
		return this.name;
	}
}

class Bicycle extends Cycle {
	private String name = "Bicycle";
	private int wheels = 2;

	@Override
	public int wheels() {
		return wheels;
	}

	public String toString() {
		return this.name;
	}

}

class Tricycle extends Cycle {
	private String name = "Tricycle";
	private int wheels = 3;

	@Override
	public int wheels() {
		return wheels;
	}

	public String toString() {
		return this.name;
	}
}

public class BikingTest {
	public static void ride(Cycle c) {
		Cycle.travel(c);
		System.out.println("wheels: " + c.wheels());
	}

	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		// up cast to Cycle
		ride(u);
		ride(b);
		ride(t);
	}
}
