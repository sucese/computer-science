package com.guoxiaoxing.algorithm.sort;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/9/25 下午2:15
 */
public class SortUtils {


    /**
     * bubble sort
     *
     * @param origin origin data
     * @return sorted data
     */
    public static int[] bubbleSort(int[] origin) {
        int[] dest = origin;
        if (origin == null || origin.length < 2) {
            return dest;
        }
        for (int i = 0; i < origin.length; i++) {
            //每次内循环都通两两比较与交换，找到一个最小的树放入已排序部分中
            for (int j = origin.length - 1; j > i; j--) {
                if (dest[j] < dest[j - 1]) {
                    int temp = dest[j];
                    dest[j] = dest[j - 1];
                    dest[j - 1] = temp;
                }
            }
        }
        return dest;
    }

    /**
     * insert sort
     *
     * @param origin origin data
     * @return sorted data
     */
    public static int[] insertSort(int[] origin) {
        int[] dest = origin;
        if (origin == null || origin.length < 2) {
            return dest;
        }
        //假设第一个元素的位置是正确的
        for (int i = 1; i < dest.length; i++) {
            //找到dest[i]在前面已排序不封中的合适插入位置
            for (int j = i; j > 0; j--) {
                if (dest[j] < dest[j - 1]) {
                    int temp = dest[j];
                    dest[j] = dest[j - 1];
                    dest[j - 1] = temp;
                }
            }
        }
        return dest;
    }

    /**
     * shell sort
     *
     * @param origin origin data
     * @return sorted data
     */
    public static int[] shellSort(int[] origin) {
        int[] dest = origin;
        if (origin == null || origin.length < 2) {
            return dest;
        }

        return dest;
    }

    /**
     * insert sort
     *
     * @param origin origin data
     * @return sorted data
     */
    public static int[] Sort(int[] origin) {
        int[] dest = origin;
        if (origin == null || origin.length < 2) {
            return dest;
        }

        return dest;
    }
}
