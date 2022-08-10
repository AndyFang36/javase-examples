package examples.s05_list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RandomAccessTest {
    public static List<Integer> arrayList = new ArrayList<>();
    public static List<Integer> linkedList = new LinkedList<>();

    public static long getTime(List<Integer> list) {
        long oldTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int index = Collections.binarySearch(list, list.get(i));
            if (index != i) {
                System.out.println("ERROR!");
            }
        }
        return System.currentTimeMillis() - oldTime;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("访问ArrayList消耗的时间：" + getTime(arrayList));
        System.out.println("访问LinkedList消耗的时间：" + getTime(linkedList));
    }
}