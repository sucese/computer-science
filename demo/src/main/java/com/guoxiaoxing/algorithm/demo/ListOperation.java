package com.guoxiaoxing.algorithm.demo;

import android.util.Log;

import java.util.List;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/8/31 上午10:52
 */
public final class ListOperation {

    private static final String TAG = "ListOperation";


    public static void addFirst(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        Log.d(TAG, list.getClass().getName() +  " add first time : " + time);
    }

    public static void addEnd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        Log.d(TAG, list.getClass().getName() + " add end time : " + time);
    }
}
