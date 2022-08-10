package exercises.e10;

/**
 * <h1>Exercise 10.2</h1>
 * You can test for the length of the command-line argument array.
 * <hr/>
 * System.exit() terminates the program and passes its argument back to the operating system as a status code. (With
 * most operating systems, a non-zero status code indicates that the program execution failed.) Typically, you send
 * error messages to System.err, as shown above.
 */
public class MainArgsLength {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Need 3 arguments!!!");
            System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
