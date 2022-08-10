package examples.String;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        /* length() */
        /* isEmpty() */
        String myStr1 = "Hello, String!";
        String myStr2 = "";  // 空字符串
        String myStr3 = "    ";  // 多个空格，length() 不为 0
        System.out.println("myStr1 是否为空：" + myStr1.isEmpty());
        System.out.println("myStr2 是否为空：" + myStr2.isEmpty());
        System.out.println("myStr3 长度：" + myStr3.length());
        System.out.println("myStr3 是否为空：" + myStr3.isEmpty());
        System.out.println("-----------------------------------------------------------------------------------------");

        /* charAt() */
        String s = "Hello, String!";
        System.out.println("string = \"Hello, String!\"");
        System.out.println("index = 0 ==> " + s.charAt(0));
        System.out.println("index = 5 ==> " + s.charAt(5));
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * getChars()
         * 将字符从字符串复制到目标字符数组。
         */
        String url = "https://www.apple.com";
        char[] copy = new char[5];
        try {
            url.getChars(12, 17, copy, 0);
            System.out.println(copy);
        } catch (Exception e) {
            System.out.println("触发异常...");
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * compareTo()
         * 返回值是整型，它是先比较对应字符的大小(ASCII码顺序)，如果第一个字符和参数的第一个字符不等，结束比较，返回他们之间的长度差值，如果第一个
         * 字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至比较的字符或被比较的字符有一方结束。
         * * 如果参数字符串等于此字符串，则返回值 0；
         * * 如果此字符串小于字符串参数，则返回一个小于 0 的值；
         * * 如果此字符串大于字符串参数，则返回一个大于 0 的值。
         *
         * compareToIgnoreCase()不考虑大小写
         */
        String
            str1 = "Strings",
            str2 = "Strings",
            str3 = "Strings123",
            str4 = "strings";
        System.out.println("str1 = \"Strings\"\nstr2 = \"Strings\"\nmyStr = \"Strings123\"");
        System.out.println("str1.compareTo(str2) --> " + str1.compareTo(str2));
        System.out.println("str2.compareTo(myStr) --> " + str2.compareTo(str3));
        System.out.println("myStr.compareTo(str1) --> " + str3.compareTo(str1));
        System.out.println("str1.compareToIgnoreCase(str4) --> " + str1.compareToIgnoreCase(str4));
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * equals()
         * String 中 == 比较引用地址是否相同，equals() 比较字符串的内容是否相同：
         * equalsIgnoreCase() 方法用于将字符串与指定的对象比较，不考虑大小写。
         */
        String strA = "Hello";
        String strB = strA;
        String strC = "Hello";
        String strD = new String("Hello");
        System.out.println("strA.equals(strB) --> " + strA.equals(strB));
        System.out.println("strA == strB --> " + (strA == strB));
        System.out.println("strA.equals(strC) --> " + strA.equals(strC));
        System.out.println("strA == strC --> " + (strA == strC));
        System.out.println("strA == strD --> " + (strA == strD));
        System.out.println("strB == strD --> " + (strB == strD));
        System.out.println("strC == strD --> " + (strC == strD));
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * contentEquals()
         * 用于将此字符串与指定的StringBuffer比较
         */
        String str5 = "String5";
        String str6 = "String6";
        StringBuffer sb = new StringBuffer("String5");
        System.out.println("str5 = \"String5\"\nstr6 = \"String6\"\nsb = \"String5\"");
        System.out.println("str5.contentEquals(sb) --> " + str5.contentEquals(sb));
        System.out.println("str6.contentEquals(sb) --> " + str6.contentEquals(sb));
        System.out.println("-----------------------------------------------------------------------------------------");

        /* concat() */
        String website = "苹果官网", link = "www.apple.com";
        System.out.println(website.concat(link));
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * copyValueOf()
         * public static String copyValueOf(char[] data): 返回指定数组中表示该字符序列的字符串。
         * public static String copyValueOf(char[] data, int offset, int count): 返回指定数组中表示该字符序列的字符串。
         */
        char[] chars = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'S', 't', 'r', 'i', 'n', 'g', '!'};
        System.out.println(Arrays.toString(chars));
        System.out.println("copyValueOf(chars) --> " + String.copyValueOf(chars));
        System.out.println("copyValueOf(chars, 0, 5) --> " + String.copyValueOf(chars, 0, 5));
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * startWith()
         * endsWith()
         */
        String string = "苹果官网 = www.apple.com";
        System.out.println("string.endsWith(\"apple\") --> " + string.endsWith("apple"));
        System.out.println("string.endsWith(\"com\") --> " + string.endsWith("com"));
        System.out.println("-----------------------------------------------------------------------------------------");

        /* getBytes() */
        String hello = "Hello";
        byte[] bytes = hello.getBytes();
        System.out.println("getBytes() --> " + Arrays.toString(bytes));
        bytes = hello.getBytes(StandardCharsets.UTF_8);
        System.out.println("getBytes(StandardCharsets.UTF_8) --> " + Arrays.toString(bytes));
        bytes = hello.getBytes(StandardCharsets.ISO_8859_1);
        System.out.println("getBytes(StandardCharsets.ISO_8859_1) --> " + Arrays.toString(bytes));
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * hashCode()
         * 字符串对象的哈希码根据以下公式计算：s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
         */
        System.out.println(hello.hashCode());
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * indexOf()
         * lastIndexOf(): 返回指定字符(串)在此字符串中最后一次出现处的索引。
         */
        String myStr = "Hello, String123!Str", subStr = "Str";
        System.out.println("myStr.indexOf('e') --> " + myStr.indexOf('e'));
        System.out.println("myStr.indexOf(101) --> " + myStr.indexOf(101));
        System.out.println("myStr.indexOf('g', 7) --> " + myStr.indexOf('g', 7));
        System.out.println("myStr.indexOf(subStr) --> " + myStr.indexOf(subStr));
        System.out.println("myStr.lastIndexOf(subStr) --> " + myStr.lastIndexOf(subStr));
        System.out.println("-----------------------------------------------------------------------------------------");

        /* creating() */
        System.out.println(link.matches("www(.*)"));
        System.out.println(link.matches("(.*)apple(.*)"));
        System.out.println(link.matches("(.*)google(.*)"));
        System.out.println("-----------------------------------------------------------------------------------------");

        /* replace() */
        System.out.println(hello.replace('o', 'O'));
        System.out.println(hello.replace('l', 'L'));
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * replaceAll()
         * 使用给定的参数 replacement 替换字符串所有匹配给定的正则表达式的子字符串。
         * 成功则返回替换的字符串，失败则返回原始字符串。
         * replaceFirst() 方法使用给定的参数 replacement 替换字符串第一个匹配给定的正则表达式的子字符串。
         */
        System.out.print("匹配成功返回值: " );
        System.out.println(link.replaceAll("(.*)apple(.*)", "google" ));
        System.out.print("匹配失败返回值: " );
        System.out.println(link.replaceAll("(.*)microsoft(.*)", "google" ));
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
         * spliting()
         * public String[] spliting(String regex, int limit)
         * limit -- 分割的份数。
         * 根据匹配给定的正则表达式来拆分字符串。
         */
        System.out.println(".分隔符返回值:" );
        for (String temp: link.split("\\.")){
            System.out.println(temp);
        }
        System.out.println(".分隔符设置分割份数返回值:" );
        for (String temp: link.split("\\.", 2)){
            System.out.println(temp);
        }
        String myStr4 = "account=? and uu =? or n=?";
        System.out.println("多个分隔符返回值:");
        for (String temp: myStr4.split("and|or")){
            System.out.println(temp);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}