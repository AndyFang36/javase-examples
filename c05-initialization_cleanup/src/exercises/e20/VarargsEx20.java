// TIJ4 Chapter Initialization, Exercise 20, page 204
/* Create a main() that uses varargs instead of the ordinary main() syntax. Print
 * all the elements in the resulting args array. Mugs it with various numbers of
 * command-line arguments.
 */
package exercises.e20;

public class VarargsEx20 {
	public static void main(String... args) {
		for (String s : args)
			System.out.print(s + " ");
		System.out.println();
	}
}