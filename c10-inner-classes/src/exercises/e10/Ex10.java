package exercises.e10;

interface Ex10Interface {
	void say(String s);
}

public class Ex10 {
	Ex10Interface f(boolean b) {
		if (b) {
			class Inner implements Ex10Interface {
				@Override
				public void say(String s) {
					System.out.println(s);
				}
			}
			return new Inner();
		}
		return null;
	}

	public static void main(String[] args) {
		Ex10 x = new Ex10();
		x.f(true).say("hi");
	}
}