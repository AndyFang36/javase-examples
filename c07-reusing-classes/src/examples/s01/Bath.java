package examples.s01;

import static net.mindview.util.Print.*;

class Soap {
    private String s;

    Soap() {
        print("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    // Initializing at point of definition:
    private String s1 = "Happy1", s2 = "Happy2", s3, s4;
    private Soap soap;
    private int i;
    private float toy;

    Bath() {
        print("Bath()");
        s3 = "Joy";
        toy = 3.14F;
        soap = new Soap();
    }

    // Instance initialization:
    {
        i = 47;
    }

    public String toString() {
        if (s4 == null)  // Delayed initialization:
            s4 = "Joy";
        return "s1 = " + s1 +
            "\ns2 = " + s2 +
            "\ns3 = " + s3 +
            "\ns4 = " + s4 +
            "\ni = " + i +
            "\ntoy = " + toy +
            "\nsoap = " + soap;
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        print(bath);
    }
}