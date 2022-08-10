package exercises.e07;

/**
 * Turn the Incremental code fragments into a working program.
 * <hr/>
 * You can call increment() by itself, because a static method (main(), in this case) can call another static method
 * without qualification.
 */
class StaticTest {
    static int i = 47;
}

public class Incremental {
    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Incremental self = new Incremental();
        self.increment();
        System.out.println(StaticTest.i);
        Incremental.increment();
        System.out.println(StaticTest.i);
        increment();
        System.out.println(StaticTest.i);
    }
}