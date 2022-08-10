package examples.s04;

import java.util.Random;

public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++)
            f[i] = random.nextFloat();
        for (float temp : f)
            System.out.println(temp);
    }
}