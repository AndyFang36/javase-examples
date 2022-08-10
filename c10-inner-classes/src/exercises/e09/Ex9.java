package exercises.e09;

interface Ex9Interface {
	void say(String s);
}

public class Ex9 {
	Ex9Interface f() {
		class Inner implements Ex9Interface {
			@Override
			public void say(String s) {
				System.out.println(s);
			}
		}
		return new Inner();
	}

	public static void main(String[] args) {
		Ex9 x = new Ex9();
		x.f().say("hi");
	}
}