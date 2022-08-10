package examples.s08.varargs;

class A {
}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(
            new Object[]{47L, 3.14F, 11.11D}
        );
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});  // class name + object address
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        printArray(new Object[]{a1, a2, a3});  // class name + object address
    }
}