package examples.s07;

import java.util.Random;

interface RandVal {
    Random r = new Random(47);
    int INT = r.nextInt(10);
    long LONG = r.nextLong();
    float FLOAT = r.nextFloat();
    double DOUBLE = r.nextDouble();
}

public class TestRandVal {
    public static void main(String[] args) {
        System.out.println(RandVal.INT);
        System.out.println(RandVal.LONG);
        System.out.println(RandVal.FLOAT);
        System.out.println(RandVal.DOUBLE);
    }
}