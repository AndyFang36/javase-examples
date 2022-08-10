// TIJ4 Chapter Initialization, Exercise 9, page 172
// Create a class with two (overloaded) constructors. Using 'this', call
// the second constructor from inside the first one.
package exercises.e09;

class Student {
	Student(int i) {
		this("PHD");
		System.out.println("New student with " + i + " years of training");
	}

	Student(String s) {
		System.out.println("New student with " + s + " degree");
	}

	void open() {
		System.out.println("prepare patient");
		computer();
	}

	void computer() {
		System.out.println("use computer");
	}
}

public class OverloadedConstructors {
	public static void main(String[] args) {
		new Student(4).open();
	}
}
