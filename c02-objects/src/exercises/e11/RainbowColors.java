package exercises.e11;

/**
 * <h1>Exercise 11</h1>
 * Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
 */
public class RainbowColors {
    int anIntegerRepresentingColors;

    void changeHue(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        RainbowColors colors = new RainbowColors();
        colors.changeHue(27);
    }
}