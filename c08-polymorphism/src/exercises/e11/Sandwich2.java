package exercises.e11;

class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Pickle {
	Pickle() {
		System.out.println("Pickle()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

class Sandwich2 extends PortableLunch {
	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();
	private Pickle pickle = new Pickle();

	Sandwich2() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich2();
	}
}
