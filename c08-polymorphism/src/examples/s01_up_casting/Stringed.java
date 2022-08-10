package examples.s01_up_casting;

import static net.mindview.util.Print.print;

class Stringed extends Instrument {
    protected void play(Note n) { print("Stringed play() " + n); }
}
