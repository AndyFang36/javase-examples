package examples.s05_list.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertDeleteTest {
    public static List<Integer> arrayList = new ArrayList<>();
    public static List<Integer> linkedList = new LinkedList<>();

    public static long insertTime(List<Integer> list) {
        long oldTime = System.currentTimeMillis();
        for (int i = 100; i < 100000; i++) {
            list.add(10, i);
        }
        long newTime = System.currentTimeMillis();
        return (newTime - oldTime);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("插入ArrayList消耗的时间：" + insertTime(arrayList) + "ns");
        System.out.println("插入LinkedList消耗的时间：" + insertTime(linkedList) + "ns");
    }
}