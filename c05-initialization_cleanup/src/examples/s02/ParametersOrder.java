package examples.s02;

import static net.mindview.util.Print.*;

public class ParametersOrder {
    static void func(String s, int i) {
        print("String: " + s + ", int: " + i);
    }

    static void func(int i, String s) {
        print("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        func("String first", 6);
        func(6, "int first");
    }
}