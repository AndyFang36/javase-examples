package examples.StringBuilder;

import java.util.Random;

public class Demo {
    public static final Random rand = new Random(47);

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 10; i++) {
            result.append(rand.nextInt(100));
            if (i != 9) result.append(", ");
        }
        // result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        Demo s = new Demo();
        System.out.println(s);
    }
}