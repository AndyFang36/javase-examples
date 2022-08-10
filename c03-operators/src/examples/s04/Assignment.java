package examples.s04;

import static net.mindview.util.Print.*;

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        // t1.level = t2.level;
        // print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;  // Both t1 and t2 contain the same reference, which is pointing to the same object.
        print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}

class Tank {
    int level;
}