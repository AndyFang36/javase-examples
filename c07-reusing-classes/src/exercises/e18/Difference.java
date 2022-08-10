package exercises.e18;

import java.util.*;

import static net.mindview.util.Print.*;

class Test {
	Test() {
		print("Test()");
	}
}

public class Difference {
	private String name;
	private static Random rand = new Random();

	public Difference(String s) {
		name = s;
	}

	// constant reference address
	static final Test sft = new Test();
	final Test ft = new Test();
	// class constant
	static final String SFS = "static final";
	final String fs = "final";
	// class constant
	static final int SFI = rand.nextInt(10);
	final int fi = rand.nextInt(10);

	public String toString() {
		return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
	}

	public static void main(String[] args) {
		Difference d1 = new Difference("d1");
		Difference d2 = new Difference("d2");
		Difference d3 = new Difference("d3");
		print(d1);
		print(d2);
		print(d3);
	}
}
