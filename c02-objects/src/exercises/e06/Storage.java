package exercises.e06;

/**
 * Write a program that includes and calls the storage() method defined as a code fragment in this chapter.
 */
public class Storage {
    String s = "Hello, world!";

    int storage(String text) {
        return text.length();
    }

    void print() {
        System.out.println("storage(s) = " + storage(s));
    }

    public static void main(String[] args) {
        Storage st = new Storage();
        st.print();
    }
}