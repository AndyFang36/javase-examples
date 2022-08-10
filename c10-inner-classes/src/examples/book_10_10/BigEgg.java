package examples.book_10_10;

class Egg {
	protected class Yolk {
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}

	private Yolk yolk;

	public Egg() {
		System.out.println("new egg");
		yolk = new Yolk();
	}
}

public class BigEgg extends Egg {
	public class Yolk {
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
	}

	public static void main(String[] args) {
		new BigEgg();
	}
}
