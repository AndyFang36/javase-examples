package exercises.e05;

import static net.mindview.util.Print.print;

public class Dog {
    private String name;
    private String says;

    public void setName(String n) {
        name = n;
    }

    public void setSays(String s) {
        says = s;
    }

    public void showName() {
        print(name);
    }

    public void speak() {
        print(says);
    }
}