package examples.s04;

public class Leaf {
    int i;

    Leaf increment() {
        ++i;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}