package examples.s01_abstract;

import static net.mindview.util.Print.print;

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
    }
}
