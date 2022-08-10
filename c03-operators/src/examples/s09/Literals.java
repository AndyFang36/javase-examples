package examples.s09;

import static net.mindview.util.Print.*;

public class Literals {
    public static void main(String[] args) {
        /* Hexadecimal (lowercase) */
        int i1 = 0x2f;
        print("i1: " + Integer.toBinaryString(i1));
        /* Hexadecimal (uppercase) */
        int i2 = 0X2F;
        print("i2: " + Integer.toBinaryString(i2));
        /* Octal (leading zero) */
        int i3 = 0177;
        print("i3: " + Integer.toBinaryString(i3));
        // max char hex value
        char c = 0xFFFF;  // 16bit
        print(c);
        print("c: " + Integer.toBinaryString(c));
        // max byte hex value
        byte b = 0x7f;  // 8bit
        print(b);
        print("b: " + Integer.toBinaryString(b));
        // max short hex value
        short s = 0x7fff;  // 16bit
        print("s: " + Integer.toBinaryString(s));

        long n1 = 200L; // long suffix
        long n2 = 200l; // long suffix (but can be confusing)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // float suffix
        float f3 = 1f; // float suffix
        double d1 = 1d; // double suffix
        double d2 = 1D; // double suffix
        // (Hex and Octal also work with long)
    }
}