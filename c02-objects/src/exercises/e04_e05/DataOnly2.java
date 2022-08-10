package exercises.e04_e05;

/**
 * Modify Exercise 4 so the values of the data in DataOnly are assigned to and printed in main().
 */
public class DataOnly2 {
    public static void main(String[] args) {
        DataOnly d = new DataOnly();
        d.i = 47;
        System.out.println("d.i = " + d.i);
        d.d = 1.1;
        System.out.println("d.d = " + d.d);
        d.b = false;
        System.out.println("d.b = " + d.b);
    }
}