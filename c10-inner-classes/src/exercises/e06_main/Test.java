package exercises.e06_main;

import exercises.e06_base.ExBase;
import exercises.e06_interface.ExInterface;

public class Test extends ExBase {
	Test() {
		System.out.println("Test()");
	}

	ExInterface getBaseInner() {
		return this.new ExBaseInner();
	}

	public static void main(String[] args) {
		Test ex = new Test();
		System.out.println(ex.getBaseInner().say());
	}
}
