package exercises.e16;

import static net.mindview.util.Print.*;

class Unicycle implements Cycle {
	private Unicycle() {
		print("Unicycle()");
	}

	@Override
	public void ride() {
		print("Ride Unicycle");
	}

	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}

class Bicycle implements Cycle {
	private Bicycle() {
		print("Bicycle()");
	}

	public void ride() {
		print("Ride Bicycle");
	}

	public static CycleFactory factory =
		new CycleFactory() {
			public Cycle getCycle() {
				return new Bicycle();
			}
		};
}

class Tricycle implements Cycle {
	private Tricycle() {
		print("Tricycle()");
	}

	public void ride() {
		print("Ride Tricycle");
	}

	public static CycleFactory factory =
		new CycleFactory() {
			public Cycle getCycle() {
				return new Tricycle();
			}
		};
}
