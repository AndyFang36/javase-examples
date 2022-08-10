package examples.StringBuilder;

public class Demo2 {
    /* 隐式使用StringBuilder */
    public static String implicit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }

    /* 显式使用StringBuilder */
    public static String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for (String temp : fields) {
            result.append(temp);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] strArray = {"Hello", ", ", "Java", "!"};
        System.out.println(explicit(strArray));
    }
}