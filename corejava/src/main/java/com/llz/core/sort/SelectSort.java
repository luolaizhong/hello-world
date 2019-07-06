package com.llz.core.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 2, 3, 6, 5, 4, 7};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 首位数字依次和后面数字比大小，找到最小（大）数字的左边，最后换位；依次类推
     * @param arr 待排序数组
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
    }
}
