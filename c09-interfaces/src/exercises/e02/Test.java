package exercises.e02;

abstract class NoGo1 {
	NoGo1() {
		System.out.println("NoGo1()");
	}
}

abstract class NoGo2 {
}

class Go1 extends NoGo1 {
	Go1() {
		System.out.println("Go1()");
	}
}

public class Test {
	public static void main(String[] args) {
		// NoGo1 & NoGo2 cannot be instantiated:
		//! NoGo1 ng1 = new NoGo1();
		//! NoGo2 ng2 = new NoGo2();
		// But NoGo1() constructor called during instantiation of child:
		Go1 g1 = new Go1();
		NoGo1 ng = new Go1();
	}
}
