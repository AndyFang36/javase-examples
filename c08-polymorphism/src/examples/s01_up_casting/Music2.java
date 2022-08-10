package examples.s01_up_casting;

public class Music2 {
    public static void tune(Wind w) { w.play(Note.MIDDLE_C); }

    public static void tune(Stringed s) { s.play(Note.MIDDLE_C); }

    public static void tune(Brass b) { b.play(Note.MIDDLE_C); }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}