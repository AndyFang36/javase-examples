package exercises.e06_base;

import exercises.e06_interface.ExInterface;

public class ExBase {
	protected class ExBaseInner implements ExInterface {
		// need public constructor to create one in ExBase child:
		public ExBaseInner() {
			System.out.println("ExBaseInner()");
		}

		@Override
		public String say() {
			return "Hi";
		}
	}
}
