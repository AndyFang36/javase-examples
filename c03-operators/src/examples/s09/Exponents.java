/* "e" means "10 to the power." */

package examples.s09;

public class Exponents {
    public static void main(String[] args) {
        // Uppercase and lowercase 'e' are the same:
        float expFloat = 1.39e-43F;
        System.out.println("expFloat = " + expFloat);
        double expDouble = 47e47D;
        double expDouble2 = 47e47;  // Automatically double
        System.out.println("expDouble = " + expDouble);
        System.out.println("expDouble2 = " + expDouble2);
    }
}