package exercises.e01;

/**
 * Create a class containing an int and a char that are not initialized. Print their values to verify that Java
 * performs default initialization.<hr/>
 * When you run the program you’ll see that both variables are given default values: 0 for the int, and a "space" for
 * the char.
 */
public class DefaultInitialization {
    int i;
    char c;

    public DefaultInitialization() {
        System.out.println("i = " + i);
        System.out.println("c = '" + c + "'");
    }

    public static void main(String[] args) {
        new DefaultInitialization();
    }
}
