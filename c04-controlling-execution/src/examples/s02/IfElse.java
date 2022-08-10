package examples.s02;

import static net.mindview.util.Print.*;

public class IfElse {
    public static void main(String[] args) {
        test(10, 5);
        print(result);
        test(5, 10);
        print(result);
        test(5, 5);
        print(result);
    }

    static int result = 0;

    static void test(int guess, int target) {
        if (guess > target)
            result = +1;
        else if (guess < target)
            result = -1;
        else
            result = 0;

    }
}