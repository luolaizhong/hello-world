package com.llz.core.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 1, 3, 2, 0, 9, 5, 6};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 取数组中一个数字，和前面（已排序）的比大小，找到位置插入（该位置后面的数组依次向后挪位）。
     * @param arr 待排序数组
     */
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                } else {
                    arr[j + 1] = tmp;
                    break;
                }
            }
        }
    }
}
