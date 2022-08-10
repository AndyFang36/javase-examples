package examples.s04;

class Banana {
    void peel(int i) {
        System.out.println("Peeling " + i);
    }
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana
	        a = new Banana(),
	        b = new Banana();
        a.peel(1);  // Banana.peel(a, 1);
        b.peel(2);  // Banana.peel(b, 2);
    }
}