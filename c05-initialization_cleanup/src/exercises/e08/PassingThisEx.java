// TIJ4 Chapter Initialization, Exercise 8, page 170
/* Create a class with two methods. Within the first method, call the
 * second method twice: the first time without using this, and the second time
 * using this - just to see it working; you should not use this form in
 * practice.
 */
package exercises.e08;

class Doc {
	void open() {
		System.out.println("prepare patient...");
		computer();
		this.computer();
	}

	void computer() {
		System.out.println("use computer");
	}
}

public class PassingThisEx {
	public static void main(String[] args) {
		new Doc().open();
	}
}
