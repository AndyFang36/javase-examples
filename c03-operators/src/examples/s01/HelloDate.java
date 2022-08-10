package examples.s01;

import java.util.Date;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class HelloDate {
    public static void main(String[] args) {
        printnb("Hello, it's ");
        print(new Date());
    }
}