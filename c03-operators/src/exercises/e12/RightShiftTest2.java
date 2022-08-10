// TIJ4 Chapter Operator, Exercise 12, page 116
/* Start with a number that is all binary ones. Left shift it, then use the
 * unsigned right-shift operator to right shift through all of its binary
 * positions, each time displaying the result using Integer.toBinarySting().
 */
package exercises.e12;

import static net.mindview.util.Print.*;

public class RightShiftTest2 {
	public static void main(String[] args) {
		int h = -1;
		print("Original Integer:\n" + h);
		print("Original Binary:\n" + Integer.toBinaryString(h));
		h <<= 10;
		print("h <<= 10:\n" + Integer.toBinaryString(h));
		print("Shifting:");
		for (int i = 0; i < 32; i++) {
			h >>>= 1;
			print(Integer.toBinaryString(h));
		}
	}
}
