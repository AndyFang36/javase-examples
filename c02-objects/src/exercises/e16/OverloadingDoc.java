/*
 * Exercise 16
 * In the Initialization and Cleanup chapter, add Javadoc documentation to the Overloading.java example. Extract it
 * into an HTML file using Javadoc and view it with your Web browser.
 */

package exercises.e16;

/**
 * Model of a single arboreal unit.
 */
class Tree {
    /**
     * Current vertical aspect to the tip.
     */
    int height;  // 0 by default

    /**
     * Plant a seedling. Assume height can be considered as zero.
     */
    Tree() {
        System.out.println("Planting a seedling...");
    }

    /**
     * Transplant an existing tree with a given height.
     */
    Tree(int i) {
        System.out.println("Creating new Tree that is " + i + " feet tall.");
        height = i;
    }

    /**
     * Produce information about this unit.
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall.");
    }

    /**
     * Produce information with optional message.
     */
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall.");
    }
}

/**
 * Simple test code for Tree class
 */
public class OverloadingDoc {
    /**
     * Creates <b>Tree</b> objects and exercises the two different <code>info()</code> methods.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
            System.out.println();
        }
        new Tree();  // Overloaded constructor
    }
}