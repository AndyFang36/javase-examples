package examples.s04;

class Soup1 {
    private Soup1() {
        System.out.println("Soup1 constructor");
    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }

    void f() {
        System.out.println("Soup1 f()");
    }
}

class Soup2 {
    private Soup2() {
        System.out.println("Soup2 constructor");
    }

    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        System.out.println("new object ps1");
        return ps1;
    }

    public void f() {
        System.out.println("Soup2 f()");
    }
}

public class Lunch {
    static void testPrivate() {
        // can't do this! Private constructor
        //! Soup1 soup = new Soup1();
    }

    static void testStatic() {
        Soup1 soup = Soup1.makeSoup();
        soup.f();
    }

    static void testSingleton() {
        Soup2.access().f();
    }

    public static void main(String[] args) {
        Lunch.testPrivate();
        Lunch.testStatic();
        Lunch.testSingleton();
    }
}