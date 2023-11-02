package com.learn.questions.day14;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,1,0,4};
        System.out.println(canJump(nums));

        for (int i = 0; i< 5; i++) {
            System.out.println(i);
        }
    }

    public static boolean canJump(int[] nums) {
        int reachAble = 0;
        for (int i =0; i<nums.length; i++) {
            if (i > reachAble) return false;
            reachAble = Math.max(reachAble, i+nums[i]);
        }
        return true;
    }
}
