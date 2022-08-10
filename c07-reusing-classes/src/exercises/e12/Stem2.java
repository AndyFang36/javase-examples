package exercises.e12;

import static net.mindview.util.Print.*;

class Component1 {
	Component1() {
		print("Component1()");
	}

	void dispose() {
		print("Component1.dispose()");
	}
}

class Component2 {
	Component2() {
		print("Component2()");
	}

	void dispose() {
		print("Component2.dispose()");
	}
}

class Component3 {
	Component3() {
		print("Component3()");
	}

	void dispose() {
		print("Component3.dispose()");
	}
}

class Root2 {
	Component1 c1root;
	Component2 c2root;
	Component3 c3root;

	Root2() {
		print("Root2()");
		c1root = new Component1();
		c2root = new Component2();
		c3root = new Component3();
	}

	void dispose() {
		c3root.dispose();
		c2root.dispose();
		c1root.dispose();
		print("Root2.dispose()");
	}
}

class Stem2 extends Root2 {
	Component1 c1stem;
	Component2 c2stem;
	Component3 c3stem;

	Stem2() {
		super();
		print("Stem2()");
		c1stem = new Component1();
		c2stem = new Component2();
		c3stem = new Component3();
	}

	void dispose() {
		c3stem.dispose();
		c2stem.dispose();
		c1stem.dispose();
		super.dispose();
		print("Stem2.dispose()");
	}

	public static void main(String[] args) {
		Stem2 s = new Stem2();
		try {
			// Code and exception handling...
		} finally {
			s.dispose();
		}
	}
}
