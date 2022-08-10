package examples.regular_expression.Pattern_Matcher;

import static net.mindview.util.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static final String POEM
        = "Twas brillig, and the slithy toves\n" +
        "Did gyre and gimble in the wabe.\n" +
        "All mimsy were the borogoves,\n" +
        "And the mome raths outgrabe.\n\n" +
        "Beware the Jabberwock, my son,\n" +
        "The jaws that bite, the claws that catch.\n" +
        "Beware the Jubjub bird, and shun\n" +
        "The frumious Bandersnatch.";

    public static void main(String[] args) {
        String regEx = "(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$";
        Matcher m = Pattern.compile(regEx).matcher(POEM);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++)
                printnb("[" + m.group(i) + "]");
            print();
        }
    }
}
