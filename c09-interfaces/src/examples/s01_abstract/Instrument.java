package examples.s01_abstract;

abstract class Instrument {
    private int i;  // Storage allocated for each

    protected abstract void play(Note n);

    public String what() { return "Instrument"; }

    protected abstract void adjust();
}