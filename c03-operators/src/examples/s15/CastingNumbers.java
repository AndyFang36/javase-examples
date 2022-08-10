package examples.s15;

import static net.mindview.util.Print.*;

public class CastingNumbers {
    public static void main(String[] args) {
        double dAbove = 0.7D, dBelow = 0.4D;
        print("dAbove = 0.7D ------> (int)dAbove = " + (int) dAbove);
        print("dBelow = 0.4D ------> (int)dBelow = " + (int) dBelow);
        float fAbove = 0.7F, fBelow = 0.4F;
        print("fAbove = 0.7F ------> (int)fAbove = " + (int) fAbove);
        print("fBelow = 0.4F ------> (int)fBelow = " + (int) fBelow);
    }
}