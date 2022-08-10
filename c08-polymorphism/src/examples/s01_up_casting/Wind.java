package examples.s01_up_casting;

import static net.mindview.util.Print.print;

class Wind extends Instrument {
    @Override
    protected void play(Note n) { print("Wind.play(): " + n); }
}