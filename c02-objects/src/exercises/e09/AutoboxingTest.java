package exercises.e09;

/** <h1>Exercise 9</h1>
 * Write a program to demonstrate that autoboxing works for all the primitive types and their wrappers.
 * <hr/>
 * The terms "<i>auto boxing</i>" and "<i>auto unboxing</i>" appear often in the literature. The only difference is the
 * direction of the conversion: autoboxing converts from the primitive type to the wrapper object, and auto unboxing
 * converts from the wrapped type to the primitive type.
 */
public class AutoboxingTest {
    public static void main(String[] args) {
        Byte by = 1;
        byte bt = by;
        System.out.println("byte = " + bt);
        Short sh = 1;
        short s = sh;
        System.out.println("short = " + s);
        Integer in = 1;
        int i = in;
        System.out.println("int = " + i);
        Long lo = 1L;
        long l = lo;
        System.out.println("long = " + l);
        Boolean bo = true;
        boolean b = bo;
        System.out.println("boolean = " + b);
        Character ch = 'x';
        char c = ch;
        System.out.println("char = " + c);
        Float fl = 1.0F;
        float f = fl;
        System.out.println("float = " + f);
        Double db = 1.0D;
        double d = db;
        System.out.println("double = " + d);
    }
}