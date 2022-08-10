package examples.s08_final.final_data;

import java.util.Random;

import static net.mindview.util.Print.*;

class Value {
    int i;

    Value(int i) { this.i = i; }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    FinalData(String id) { this.id = id; }

    // Can be compile-time constants:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Typical public constant:
    public static final int VALUE_THREE = 39;
    // Cannot be compile-time constants:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    /* Arrays: */
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() { return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5; }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        print("valueOne = " + fd1.valueOne);
        //! fd1.valueOne++;  // Error: can’t change value
        print("VALUE_TWO = " + VALUE_TWO);
        print("VALUE_THREE = " + VALUE_THREE);
        fd1.v2.i++;  // Object isn't constant!
        fd1.v1 = new Value(9); // OK -- not final
        print("Arrays:");
        printnb("\t\tOriginal: ");
        for (int i = 0; i < fd1.a.length; i++) {
            printnb(fd1.a[i] + " ");
        }
        for (int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++; // Object isn’t constant!
        printnb("\n\t\tChanged: ");
        for (int i = 0; i < fd1.a.length; i++) {
            printnb(fd1.a[i] + " ");
        }
        //! fd1.v2 = new Value(0); // Error: Can’t
        //! fd1.VAL_3 = new Value(1); // change reference
        //! fd1.a = new int[3];
        print("\n" + fd1);
        print("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);
    }
}