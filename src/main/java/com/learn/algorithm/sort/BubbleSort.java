package com.learn.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int[] nums) {
        boolean swapped;
        for (int i =0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < nums.length -1 - i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
