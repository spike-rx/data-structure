package com.learn.questions.day09;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {2,2,3};
        majorityElement(nums);
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
