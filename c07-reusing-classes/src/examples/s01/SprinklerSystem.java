package examples.s01;

class WaterSource {
	private String s;

	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class SprinklerSystem {
	private String value1, value2, value3, value4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;

	public String toString() {
		return "\nvalue1 = " + value1 +
				"\nvalue2 = " + value2 +
				"\nvalue3 = " + value3 +
				"\nvalue4 = " + value4 +
				"\ni = " + i +
				"\nf = " + f +
				"\nsource = " + source;
	}

	public static void main(String[] args) {
		SprinklerSystem sprinkler = new SprinklerSystem();
		System.out.println(sprinkler);
	}
}