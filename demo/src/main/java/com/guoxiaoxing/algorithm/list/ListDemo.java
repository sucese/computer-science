package com.guoxiaoxing.algorithm.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2018/2/19 上午11:45
 */
public class ListDemo {

    public static void main(String[] args) {
        speedCompare();
    }

    private static void speedCompare() {
        List<String> arrayList = new ArrayList<>();

        long arrayListInsertBegin = System.currentTimeMillis();
        System.out.println("ArrayList insert begin: " + arrayListInsertBegin);
        for (int i = 0; i < 10000; i++) {
            arrayList.add("元素" + i);
        }
        long arrayListInsertEnd = System.currentTimeMillis();
        System.out.println("ArrayList insert end: " + arrayListInsertEnd);
        System.out.println("ArrayList insert cost time: " + (arrayListInsertEnd - arrayListInsertBegin));

        List<String> linkedList = new LinkedList<>();
        long linkedListInsertBegin = System.currentTimeMillis();
        System.out.println("LinkedList insert begin: " + linkedListInsertBegin);
        for (int i = 0; i < 10000; i++) {
            linkedList.add("元素" + i);
        }
        long linkedListInsertEnd = System.currentTimeMillis();
        System.out.println("LinkedList insert end: " + linkedListInsertEnd);
        System.out.println("LinkedList insert cost time: " + (linkedListInsertEnd - linkedListInsertBegin));


        long arrayListIRemoveBegin = System.currentTimeMillis();
        System.out.println("ArrayList remove begin: " + arrayListIRemoveBegin);
        arrayList.remove(0);
        long arrayListIRemoveEnd = System.currentTimeMillis();
        System.out.println("ArrayList remove end: " + arrayListIRemoveEnd);
        System.out.println("ArrayList remove cost time: " + (arrayListIRemoveEnd - arrayListIRemoveBegin));


        long linkedListIRemoveBegin = System.currentTimeMillis();
        System.out.println("LinkedList remove begin: " + linkedListIRemoveBegin);
        linkedList.remove(0);
        long linkedListIRemoveEnd = System.currentTimeMillis();
        System.out.println("LinkedList remove end: " + linkedListIRemoveEnd);
        System.out.println("LinkedList remove cost time: " + (linkedListIRemoveEnd - linkedListIRemoveBegin));
    }
}
