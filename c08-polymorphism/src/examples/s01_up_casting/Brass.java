package examples.s01_up_casting;

import static net.mindview.util.Print.print;

class Brass extends Instrument {
    protected void play(Note n) { print("Brass play() " + n); }
}
