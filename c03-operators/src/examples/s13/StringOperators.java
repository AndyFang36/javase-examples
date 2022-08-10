package examples.s13;

import static net.mindview.util.Print.*;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        print(s + x + y + z);
        print(x + " " + s);  // Converts x to a String
        s += "(summed) = ";  // Concatenation operator
        print(s + (x + y + z));
        print("" + x);  // Shorthand for Integer.toString()
    }
}