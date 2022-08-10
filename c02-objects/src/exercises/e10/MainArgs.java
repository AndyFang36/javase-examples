package exercises.e10;

/**
 * <h1>Exercise 10.1</h1>
 * Write a program that prints three arguments taken from the command line. You'll need to index into the command-line
 * array of Strings.
 * <hr/>
 * Remember, when you want to get an argument from the command line:
 * <ul>
 *   <li>Arguments are provided in a String array.</li>
 *   <li>args[0] is the first command-line argument and not the name of the program (as it is in C).</li>
 *   <li>You’ll cause a runtime exception if you run the program without enough arguments.</li>
 * </ul>
 */
public class MainArgs {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}