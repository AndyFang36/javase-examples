/*
 * Exercise 3
 * Modify exercise 2 with infinite while loop. Stop program with Ctrl-C.
 */

package exercises.e03;

import java.util.*;

import static net.mindview.util.Print.*;

public class CompareIntsForever {
    public static void main(String[] args) {
        Random r1 = new Random();
        Random r2 = new Random();
        while (true) {
            // for(int i = 0; i < 25; i++) {}
            int x = r1.nextInt(10);
            int y = r2.nextInt(10);
            if (x < y) {
                print(x + " < " + y);
            } else if (x > y)
                print(x + " > " + y);
            else
                print(x + " = " + y);
        }
    }
}