package examples.s04;

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy!");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        System.out.println("Peeling...");
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        System.out.println("Ready to peel.");
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}