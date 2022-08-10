/*
 * Exercise 4
 * Write a program that calculates velocity using a constant distance and a constant time.
 */

package exercises.e04;

import static net.mindview.util.Print.*;

public class Test {
    public static void main(String[] args) {
        float d = 565.3f;
        float t = 3.6f;
        print("Distance: " + d + "m");
        print("Time: " + t + "s");
        float v = VelocityCalculator.velocity(d, t);
        print("Velocity: " + v + "m/s");
    }
}

class VelocityCalculator {
    static float velocity(float d, float t) {
        if (t == 0F)
        	return 0F;
        else
        	return d / t;
    }
}