package examples.s01_abstract;

import static net.mindview.util.Print.print;

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        print("Woodwind.play() " + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}