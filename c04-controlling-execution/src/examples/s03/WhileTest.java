package examples.s03;

import static net.mindview.util.Print.*;

public class WhileTest {
    public static void main(String[] args) {
        while (condition())
            print("Inside 'while'");
        print("Exited 'while'");
    }

    static boolean condition() {
        boolean result = Math.random() < 0.99;
        printnb(result + ", ");
        return result;
    }
}