package examples.s01;

public class Parcel2 {
    static class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    static class Destination {
        private final String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Contents contents() {
        return new Contents();
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public void ship(String dest) {
        Parcel1.Contents c = new Parcel1.Contents();
        Parcel1.Destination d = new Parcel1.Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Contents c = q.contents();
        Contents c1 = new Contents();
        Destination d = q.to("Borneo");
        Destination d1 = new Destination("Borneo");
    }
}