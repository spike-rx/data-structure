package com.learn.questions.day13;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int targetIndex = nums.length - 1;
        int maxIndex = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxIndex += nums[i];
            if (i ==nums.length-1 && nums[i] == 0) {
                return false;
            }

        }
        return maxIndex > targetIndex;
    }
}
