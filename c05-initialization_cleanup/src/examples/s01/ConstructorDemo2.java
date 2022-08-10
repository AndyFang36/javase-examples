package examples.s01;

class Hello {
    Hello(int i) {
        System.out.println("Hello" + i);
    }
}

public class ConstructorDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Hello(i);
        }
    }
}