package com.learn.questions.day07;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2,3};
        removeDuplicates(nums);

    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++ ) {
            if (nums[i] > nums[i - 1]) {
                nums[i] = nums[j];
                j++;
            }
        }
        System.out.println(j);
        return j;
    }
}
