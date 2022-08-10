package exercises.e07;

class Outer {
	private int i = 1;
	private String s = "Outer hello";

	private void showPrivateData() {
		System.out.println("i = " + i);
		System.out.println("s = " + s);
	}

	class Inner {
		void modifyOuter() {
			i *= 2;
			s = "Outer hello can be modified";
		}
	}

	public static void main(String[] args) {
		Outer out = new Outer();
		Inner in = out.new Inner();
		out.showPrivateData();
		in.modifyOuter();
		out.showPrivateData();
	}
}
