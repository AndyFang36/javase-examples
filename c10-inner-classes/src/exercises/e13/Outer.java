package exercises.e13;

public class Outer {
	Ex13Interface f() {
		return new Ex13Interface() {
			@Override
			public String say(String s) {
				return s;
			}
		};
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		System.out.println(outer.f().say("Hi"));
	}
}
