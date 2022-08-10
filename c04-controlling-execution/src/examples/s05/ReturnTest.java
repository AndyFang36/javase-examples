package examples.s05;

import static net.mindview.util.Print.*;

public class ReturnTest {
    public static void main(String[] args) {
        print(test(10, 5));
        print(test(5, 10));
        print(test(5, 5));
    }

    static int test(int guess, int target) {
        if (guess > target)
            return +1;
        else if (guess < target)
            return -1;
        else
            return 0;
    }
}