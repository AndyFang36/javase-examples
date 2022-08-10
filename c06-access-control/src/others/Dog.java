package others;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("The dog's name is " + this.name + ".");
    }
}