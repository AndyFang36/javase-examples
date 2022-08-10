package examples.s01;

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Rock();
        }
    }
}