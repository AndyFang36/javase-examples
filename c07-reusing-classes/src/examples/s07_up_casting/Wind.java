package examples.s07_up_casting;

class Instrument {
    protected void play() { System.out.println("Instrument.play()"); }

    static void tune(Instrument instrument) { instrument.play(); }
}

public class Wind extends Instrument {
    protected void play() { System.out.println("Wind.play()"); }

    public static void main(String[] args) {
        Wind flute = new Wind();
        flute.play();
        tune(flute);
        Wind.tune(flute);
        Instrument.tune(flute);
    }
}