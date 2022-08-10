package examples.s07;

import static net.mindview.util.Print.*;

class Bowl {
    Bowl(int maker) {
        print("Bowl (" + maker + ")");
    }

    void f1(int maker) {
        print("f1 (" + maker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        print("Table()");
        bowl2.f1(1);
    }

    void f2(int maker) {
        print("f2 (" + maker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        print("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int maker) {
        print("f3 (" + maker + ")");
    }
}

public class StaticInitialization {
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    public static void main(String[] args) {
        print("Creating new Cupboard() in main");
        new Cupboard();
        print("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
}