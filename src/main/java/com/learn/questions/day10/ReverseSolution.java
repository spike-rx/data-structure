package com.learn.questions.day10;

import java.util.Arrays;

public class ReverseSolution {
    /*1,2,3,4
    * 4,3,2,1
    * 3,4,2,1
    * 3,4,1,2
    *
    * 2,3,4
    * 4,3,2
    * 4,2,3
    * */
    public static void main(String[] args) {
        int [] nums = new int[] {1,2,3,4,5,6,7};
        int k =3;
//        rotate(nums, k);
        reverse(nums, 0, 6);
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k-1, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
