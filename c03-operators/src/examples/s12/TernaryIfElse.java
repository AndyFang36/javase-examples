package examples.s12;

import static net.mindview.util.Print.*;

public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElse(int i) {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args) {
        print("Ternary: " + ternary(9));
        print("StandardIfElse: " + standardIfElse(9));
        print("Ternary: " + ternary(10));
        print("StandardIfElse: " + standardIfElse(10));
    }
}