package com.learn.questions.day02;

public class MinSubArray {
    // two point
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, min = nums.length + 1, sum = 0;
        for (int right =0; right< nums.length; right++) {
            sum += nums[right];
            while (sum >= target && left < nums.length) {
                min = Math.min(min, right+1 - left);
                sum -= nums[left++];
            }
        }
    return min == nums.length + 1 ? 0 : min;
    }
}
