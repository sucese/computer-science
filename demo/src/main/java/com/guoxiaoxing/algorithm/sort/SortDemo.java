package com.guoxiaoxing.algorithm.sort;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2018/3/11 下午2:04
 */
public class SortDemo {

    public static void main(String[] args) {

        int[] origin = {3, 1, 5, 4, 6, 2};
        fastSort(origin, 0, origin.length - 1);
        for (int i = 0; i < origin.length; i++) {
            System.out.println(origin[i]);
        }
    }

    /**
     * 冒泡排序：通过相邻元素的比较和交换，把小的元素交换到前面。
     *
     * @param origin origin
     * @return result
     */
    private static void bubbleSort(int[] origin) {
        if (origin == null || origin.length == 0) {
            return;
        }

        int temp;
        for (int i = 0; i < origin.length; i++) {
            for (int j = 0; j < origin.length; j++) {
                if (origin[i] < origin[j]) {
                    temp = origin[i];
                    origin[i] = origin[j];
                    origin[j] = temp;
                }
            }
        }
    }

    private static void mergeSort(int[] origin, int low, int high) {
        if (origin == null || origin.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = (low + high) / 2;
        // 左边子列排序
        mergeSort(origin, low, middle);
        // 右边子列排序
        mergeSort(origin, middle + 1, high);
        // 合并左右子列
        merge(origin, low, middle, high);
    }

    private static void merge(int[] origin, int low, int middle, int high) {
        // 左子列游标
        int leftIndex = low;
        // 右子列游标
        int rightIndex = middle + 1;
        // 临时数组
        int temp = 0;
        int[] tempOrigin = new int[high - low + 1];

        while (leftIndex <= middle && rightIndex <= high) {
            // 先把较小的元素放在临时数组中
            if (origin[leftIndex] < origin[rightIndex]) {
                tempOrigin[temp++] = origin[leftIndex++];
            } else {
                tempOrigin[temp++] = origin[rightIndex++];
            }

            // 将剩余左边子列的元素放到临时数组中
            while (leftIndex <= middle) {
                tempOrigin[temp++] = origin[leftIndex++];
            }


            // 将剩余右边子列的元素放到临时数组中
            while (rightIndex <= high) {
                tempOrigin[temp++] = origin[rightIndex++];
            }

            // 用临时数组覆盖原来的数组
            for (int i = 0; i < tempOrigin.length; i++) {
                origin[i + low] = tempOrigin[i];
            }
        }
    }

    private static void fastSort(int[] origin, int left, int right) {

        if (origin == null || origin.length == 0) {
            return;
        }

        if (left >= right) {
            return;
        }

        int middle = getMiddle(origin, left, right);
        fastSort(origin, left, middle - 1);
        fastSort(origin, middle + 1, right);
    }

    private static int getMiddle(int[] origin, int left, int right) {
        int baseNumber = origin[left];
        while (left < right) {
            // right指针先移动，寻找比temp小的元素
            while (left < right && origin[right] > baseNumber) {
                right--;
            }
            origin[left] = origin[right];
            // left指针接着移动，寻找比temp大的元素
            while (left < right && origin[left] < baseNumber) {
                left++;
            }
            origin[right] = origin[left];
        }
        origin[left] = baseNumber;
        return left;
    }

}

