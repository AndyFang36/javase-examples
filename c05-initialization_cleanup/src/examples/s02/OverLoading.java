package examples.s02;

import static net.mindview.util.Print.*;

class Tree {
    int height;

    Tree() {
        print("Planting a seedling.");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating a new Tree that is " + height + " feet tall.");
    }

    void info() {
        print("Tree is " + height + " feet tall.");
    }

    void info(String s) {
        print(s + "Tree is " + height + " feet tall.\n");
    }
}

public class OverLoading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("Overloaded method: ");
        }
        new Tree();
    }
}