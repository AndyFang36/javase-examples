/*
 * Exercise 14
 * Write a method that takes two String arguments uses all the boolean comparisons to compare the two Stings and print
 * the results. For the == and !=, also perform the equals() test. In main(), test your method with some different
 * String objects.
 */

package exercises.e14;

import static net.mindview.util.Print.*;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "one", s2 = "two";
        StringCompare.stringTest(s1, s2);
    }

    static void f(boolean b) {
        if (b)
            print(true);
        else
            print(false);
    }

    static void stringTest(String s1, String s2) {
        f(s1 == s2);
        f(s1.equals(s2));
        f(s2.equals(s1));
        f(s1 != s2);
        // f(!s1);
        // f(!s2);
        // s1 = s1 && s2;
        // s1 = s1 || s2;
        // s1 = ~s2;
        // s1 = s1 & s2;
        // s1 = s1 | s2;
        // s1 = s1 ^ s2;
        // s1 &= s2;
        // s1 ^= s2;
        // s1 |= s2;
    }
}