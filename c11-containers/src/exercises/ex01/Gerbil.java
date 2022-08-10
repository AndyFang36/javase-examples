package exercises.ex01;

public class Gerbil {
	private final int gerbilNumber;

	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	@Override
	public String toString() {
		return "gerbil " + gerbilNumber;
	}

	public void hop() {
		System.out.println(this + " is hopping");
	}
}
