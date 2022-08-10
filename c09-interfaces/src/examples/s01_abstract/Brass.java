package examples.s01_abstract;

import static net.mindview.util.Print.print;

class Brass extends Wind {
    @Override
    public void play(Note n) {
        print("Brass.play() " + n);
    }

    @Override
    public void adjust() {
        print("Brass.adjust()");
    }
}
