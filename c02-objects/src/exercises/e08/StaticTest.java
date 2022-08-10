package exercises.e08;

/**
 * Write a program to demonstrate that no matter how many objects you create of a particular class, there is only one
 * instance of a particular static field in that class.
 * <hr/>
 * The output shows that both instances of StaticTest share the same static field. We incremented the shared field
 * through the first instance and the effect was visible in the second instance.
 */
public class StaticTest {
    static int i = 47;

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        if (st1.i == st2.i)
            System.out.println(st1.i + " == " + st2.i);
        else
            System.out.println(st1.i + " != " + st2.i);
        st1.i++;
        if (st1.i == st2.i)
            System.out.println(st1.i + " == " + st2.i);
        else
            System.out.println(st1.i + " != " + st2.i);
    }
}