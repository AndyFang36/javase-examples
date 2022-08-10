package examples.s09;

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println("ordinal " + s.ordinal() + " ---> " + s);
        }
    }
}