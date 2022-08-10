// TIJ4 Chapter Initialization, Exercise 5, page 167
/* Create a class with a default constructor (one that takes no arguments) that
 * prints a message. Create an object of this class.
 */

package exercises.e05;

class Dog {
	void bark() {
		System.out.println("quiet");
	}

	void bark(char c) {
		System.out.println("caw...caw...");
	}

	void bark(byte b) {
		System.out.println("bark...bark...");
	}

	void bark(short s) {
		System.out.println("slurp...slurp...");
	}

	void bark(int i) {
		System.out.println("i...yow");
	}

	void bark(long L) {
		System.out.println("la...la...la...");
	}

	void bark(float f) {
		System.out.println("fi...fi...foo...fum");
	}

	void bark(double d) {
		System.out.println("do...do...");
	}
}

public class DogTalk {
	public static void main(String[] args) {
		Dog dog = new Dog();
		char c = 'c';
		byte b = 0;
		short s = 0;
		dog.bark();
		dog.bark((char) c);
		dog.bark((byte) b);
		dog.bark((short) s);
		dog.bark(1);
		dog.bark(1L);
		dog.bark(1.0F);
		dog.bark(1.0D);
	}
}
