package examples.s02_interface;

import static net.mindview.util.Print.print;

class Stringed implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}
