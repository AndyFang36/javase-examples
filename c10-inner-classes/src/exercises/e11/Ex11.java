package exercises.e11;

interface Ex11Interface {
	void say(String s);
}


class Test {
	private class Inner implements Ex11Interface {
		public void say(String s) {
			System.out.println(s);
		}
	}

	Ex11Interface newInner() {
		return new Inner();
	}
}

public class Ex11 {
	public static void main(String[] args) {
		Test t = new Test();
		t.newInner().say("hi");
		// Error: cannot find symbol: class Inner:
		// ((Inner)t.f()).say("hello");
	}
}