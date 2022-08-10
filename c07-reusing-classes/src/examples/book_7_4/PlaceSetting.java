// Combining composition & inheritance.
package examples.book_7_4;

import static net.mindview.util.Print.*;

class Plate {
	Plate(int i) {
		print("Plate(), i = " + i);
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		print("DinnerPlate(), i = " + i);
	}
}

class Utensil {
	Utensil(int i) {
		print("Utensil(), i = " + i);
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		print("Spoon(), i = " + i);
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		print("Fork(), i = " + i);
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		print("Knife(), i = " + i);
	}
}

// A cultural way of doing something:
class Custom {
	Custom(int i) {
		print("Custom(), i = " + i);
	}
}

public class PlaceSetting {
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;

	public PlaceSetting(int i) {
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		print("PlaceSetting()");
	}

	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
	}
}
