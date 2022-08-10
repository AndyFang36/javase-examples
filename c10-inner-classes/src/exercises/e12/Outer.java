package exercises.e12;

public class Outer {
	private int i = 1;
	private String s = "Outer hi";

	public Inner12 inner() {
		return new Inner12() {
			@Override
			public void modifyOuter() {
				i *= 2;
				s = "modified hi";
			}
		};
	}

	public void showI() {
		System.out.println(i);
	}

	public void showS() {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Outer out = new Outer();
		out.showI();
		out.showS();
		out.inner().modifyOuter();
		out.showI();
		out.showS();
	}
}
