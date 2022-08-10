import java.util.Date;

/**
 * The first Thinking in Java example program.
 * Display a string and today's date.
 * @author Andy Fang
 * @author www.apple.com
 * @version 1.0
 */
public class HelloDate {
    /**
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.print("Hello, it's ");
        System.out.println(new Date());
    }
}