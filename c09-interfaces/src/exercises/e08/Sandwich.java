package exercises.e08;

import static net.mindview.util.Print.*;

interface FastFood {
	void cheeseburger();

	void fries();

	void softDrink();
}

class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch implements FastFood {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lunch l = new Lunch();

	public Sandwich() {
		print("Sandwich8()");
	}

	@Override
	public void cheeseburger() {
		print("Cheeseburger");
	}

	@Override
	public void fries() {
		print("Fries");
	}

	@Override
	public void softDrink() {
		print("Soft Drink");
	}

	public static void main(String[] args) {
		Sandwich s = new Sandwich();
		s.cheeseburger();
		s.fries();
		s.softDrink();
	}
}
