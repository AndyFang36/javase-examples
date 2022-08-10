package examples.s08;

import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
            new Integer(1),
            new Integer(2),
            3
        };
        Integer[] b = {
            new Integer(1),
            new Integer(2),
            3
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}