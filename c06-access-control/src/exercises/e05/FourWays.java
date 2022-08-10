package exercises.e05;

class FourWays {
	int a = 0;
	public int b = 1;
	protected int c = 2;
	private int d = 3;

	FourWays() {
		System.out.println("FourWays() constructor");
	}

	void showA() {
		System.out.println("a = " + a);
	}

	public void showB() {
		System.out.println("b = " + b);
	}

	protected void showC() {
		System.out.println("c = " + c);
	}

	private void showD() {
		System.out.println("d = " + d);
	}
}
