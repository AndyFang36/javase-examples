// TIJ4 Chapter Initialization, Exercise 2, page 167
/* Create a class with a default constructor (one that takes no arguments) that
 * prints a message. Create an object of this class.
 */

package exercises.e03;

class Hello{
	public Hello() {
		System.out.println("Hello world");
	}
}
public class DefaultConstructorTest {
	public static void main(String[] args) {
		new Hello();
	}
}
