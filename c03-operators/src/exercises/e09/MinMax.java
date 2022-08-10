/*
 * Exercise 9
 * Display the largest and smallest numbers for both float and double exponential notation.
 */

package exercises.e09;

public class MinMax {
    public static void main(String[] args) {
        double maxD = Double.MAX_VALUE;
        System.out.println("Max double = " + maxD);
        double minD = Double.MIN_VALUE;
        System.out.println("Min double = " + minD);
        float maxF = Float.MAX_VALUE;
        System.out.println("Max float = " + maxF);
        float minF = Float.MIN_VALUE;
        System.out.println("Min float = " + minF);
    }
}