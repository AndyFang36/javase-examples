package examples.s03;

public class ForTest {
    public static void main(String[] args) {
        for (char c = (int) 0; c < 128; c++)
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int) c + ", character: " + c);
    }
}