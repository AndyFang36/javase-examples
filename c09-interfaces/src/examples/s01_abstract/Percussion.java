package examples.s01_abstract;

import static net.mindview.util.Print.print;

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
    }
}
