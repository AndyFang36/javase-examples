package examples.s06;

import static net.mindview.util.Print.*;

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i = " + i);
        print("++i = " + ++i);
        print("i++ = " + i++);
        print("i = " + i);
        print("--i = " + --i);
        print("i-- = " + i--);
        print("i = " + i);
    }
}