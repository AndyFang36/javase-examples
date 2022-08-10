// operators/CharBinaryTest.java
// TIJ4 Chapter Operators, Exercise 13, page 116
/* Write a method that displays char values in binary form. Demonstrate it
 * using several different characters.
 */
package exercises.e13;

import static net.mindview.util.Print.*;

public class CharBinaryTest {
	public static void main(String[] args) {
		char c = 'a';
		print(c + ": " + Integer.toBinaryString(c));
		c = 'b';
		print(c + ": " + Integer.toBinaryString(c));
		c = 'c';
		print(c + ": " + Integer.toBinaryString(c));
		c = 'd';
		print(c + ": " + Integer.toBinaryString(c));
		c += 1;
		print(c + ": " + Integer.toBinaryString(c));
		c = 'A';
		print(c + ": " + Integer.toBinaryString(c));
		for (int i = 0; i < 25; i++) {
			c += 1;
			print(c + ": " + Integer.toBinaryString(c));
		}
	}
}