package examples.s15;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
	    System.out.println(lng);  // "Widening," so cast not really required
        long lng2 = (long) 200;
	    System.out.println(lng2);
        i = (int) lng2;  // A "narrowing conversion": Cast required
	    System.out.println(i);
    }
}