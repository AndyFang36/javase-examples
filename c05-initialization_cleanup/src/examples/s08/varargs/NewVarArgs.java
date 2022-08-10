package examples.s08.varargs;

import java.util.Date;

class B {
}

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* can take individual elements: */
        printArray(47L, 3.14F, 11.11D);
        printArray("one", "two", "three");
        printArray(new B(), new B(), new B());
        printArray(new Date(), new Date(), new Date(), new Date(), new Date());
        /* or an array: */
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray();  // empty list is ok
    }
}