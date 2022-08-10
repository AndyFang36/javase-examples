package examples.s08_final.final_methods;

import static net.mindview.util.Print.*;

class A {
    /* Identical to "private" alone: */
    private final void f() { print("A.f()"); }

    /* Automatically "final": */
    private void g() { print("A.g()"); }
}

class B extends A {
    private final void f() { print("B.f()"); }

    private void g() { print("B.g()"); }
}

class C extends B {
    public final void f() {
        print("C.f()");
    }

    public void g() {
        print("C.g()");
    }
}

public class FinalOverridingTest {
    public static void main(String[] args) {
        C c = new C();
        c.f();
        c.g();
        /* You can up cast: */
        B b = c;
        /* But you can't call the methods: */
        //! b.f();
        //! b.g();
        /* Same here: */
        A a = c;
        //! a.f();
        //! a.g();
    }
}