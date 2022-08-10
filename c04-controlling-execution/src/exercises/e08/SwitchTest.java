// TIJ4 Chapter Control, Exercise 8, page 153
/* Create a switch statement that prints a message for each case, and put the
 * switch inside a for loop that tries each case.  Put a break after each case
 * and test it, then remove the breaks and see what happens.
 */
package exercises.e08;

import static net.mindview.util.Print.*;

public class SwitchTest {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			switch (i) {
				case 0:
					print("zero");
					break;
				case 1:
					print("one");
					break;
				case 2:
					print("two");
					break;
				case 3:
					print("three");
					break;
				case 4:
					print("four");
					break;
				case 5:
					print("five");
					break;
				case 6:
					print("six");
					break;
				case 7:
					print("seven");
					break;
				case 8:
					print("eight");
					break;
				case 9:
					print("nine");
					break;
				default:
					print("default");
			}
		}
	}
}
