package exercises.e10;

import static net.mindview.util.Print.*;

class Component1 {
	Component1(byte b) {
		print("Component1(byte), b = " + b);
	}
}

class Component2 {
	Component2(short s) {
		print("Component2(short), s = " + s);
	}
}

class Component3 {
	Component3(int i) {
		print("Component3(int), i = " + i);
	}
}

class Root {
	Component1 c1root;
	Component2 c2root;
	Component3 c3root;

	Root(float f) {
		c1root = new Component1((byte) 0);
		c2root = new Component2((short) 0);
		c3root = new Component3(0);
		print("Root(float), f = " + f);
	}
}

class Stem extends Root {
	Component1 c1stem10;
	Component2 c2stem10;
	Component3 c3stem10;

	Stem(double d) {
		super(2.78f);
		c1stem10 = new Component1((byte) 1);
		c2stem10 = new Component2((short) 1);
		c3stem10 = new Component3(1);
		print("Stem(double), d = " + d);
	}

	public static void main(String[] args) {
		Stem x = new Stem(2.78);
	}
}

