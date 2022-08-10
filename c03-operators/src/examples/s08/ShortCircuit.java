package examples.s08;

import static net.mindview.util.Print.*;

public class ShortCircuit {
    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("result: " + (val < 1));  // true
        return val < 1;
    }

    static boolean test2(int val) {
        print("test2(" + val + ")");
        print("result: " + (val < 2));  // false
        return val < 2;
    }

    static boolean test3(int val) {
        print("test3(" + val + ")");
        print("result: " + (val < 3));  // true
        return val < 3;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        print("expression is " + b);
    }
}