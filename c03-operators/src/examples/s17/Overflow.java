package examples.s17;

public class Overflow {
    public static void main(String[] args) {
        int maxInteger = Integer.MAX_VALUE;
        System.out.println("maxInteger = " + maxInteger);
        int result = maxInteger * 4;
        System.out.println("Result = " + result);
    }
}