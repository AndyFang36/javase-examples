package exercises.e04;

public class Prime {
    static int i, j;
    static int lineCount = 0;
    static boolean flag = true;

    public static void main(String[] args) {
        //Way1:
        for (i = 1; i <= 10000; i++) {
            int count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) {
                System.out.printf("%4d ", i);
                lineCount++;
            }
            if (lineCount > 10) {
                System.out.println();
                lineCount = 0;
            }
        }

        System.out.println();
        for (i = 0; i <= 60; i++) {
            System.out.print("-");
        }
        System.out.println();

        //Way2:
        lineCount = 0;
        for (i = 1; i <= 10000; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf("%4d ", i);
                lineCount++;
            }
            if (lineCount > 10) {
                System.out.println();
                lineCount = 0;
            }
        }
        System.out.println();
        //way3
    }
}