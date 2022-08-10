// TIJ4 Chapter Initialization, Exercise 7, page 167
/* Create a class without a constructor, and then create an object of that
 * class in main() to verify that the default constructor is automatically
 * synthesized.
 */
package exercises.e07;

class Cat {
	void makeSound() {
		System.out.println("Meow~");
	}
}

public class AutoConstructor {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
	}
}
