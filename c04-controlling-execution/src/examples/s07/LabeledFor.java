package examples.s07;

import static net.mindview.util.Print.*;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
outer:
        // Can't have statements here
        for (; true; ) {
inner:
            // Can't have statements here
            for (; i < 10; i++) {
                print("i = " + i);
                if (i == 2) {
                    print("continue");
                    continue;
                }
                if (i == 3) {
                    print("break");
                    i++; // Otherwise i never gets incremented.
                    break;
                }
                if (i == 7) {
                    print("continue outer");
                    i++; // Otherwise i never gets incremented.
                    continue outer;
                }
                if (i == 8) {
                    print("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        print("continue inner");
                        continue inner;
                    }
                }
            }
        }  // Can’t break or continue to labels here
    }
}