package examples.Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*  next方式接收字符串 */
        System.out.print("next方式接收：");
        if (scanner.hasNext()) {  // 判断是否还有输入
            String str1 = scanner.next();
            System.out.println("输入的数据为：" + str1);
        }
/*
         nextLine方式接收字符串
        System.out.print("nextLine方式接收：");
        if (Scanner.hasNextLine()) {
            String str2 = Scanner.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
*/
        scanner.close();
    }
}