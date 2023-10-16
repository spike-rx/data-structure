package com.learn.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] nums){
        for (int i=0; i< nums.length; i++) {
            int minIndex = i;
            for (int n = i+1; n < nums.length; n++) {
                if (nums[minIndex] > nums[n]) {
                    minIndex = n;
                }

            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }
    }
}
