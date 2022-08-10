package examples.s02_interface;

import static net.mindview.util.Print.print;

class Percussion implements Instrument {
    @Override
    public void play(Note n) { print(this + ".play() " + n); }

    @Override
    public void adjust() { print(this + ".adjust()"); }

    @Override
    public String toString() { return "Percussion"; }
}