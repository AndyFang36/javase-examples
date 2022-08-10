package exercises.e04;

abstract class Dad {
}

class Son extends Dad {
	protected void print() {
		System.out.println("Son");
	}
}

abstract class SecondDad {
	abstract protected void print();
}

class SecondSon extends SecondDad {
	protected void print() {
		System.out.println("SecondSon");
	}
}

public class Test {
	static void printTest(Dad d) {
		((Son) d).print();
	}

	static void printTest2(SecondDad sd) {
		sd.print();
	}

	public static void main(String[] args) {
		Son s = new Son();
		printTest(s);
		SecondSon ss = new SecondSon();
		printTest2(ss);
	}
}
