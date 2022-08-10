package examples.s01_up_casting;

import static net.mindview.util.Print.print;

class Instrument {
    protected void play(Note n) { print("Instrument.play(): " + n); }
}