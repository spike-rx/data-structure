package com.learn.questions.day14;

public class JumpGame2 {

    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,1,4};
        System.out.println(jump(nums));

    }

    public static int jump(int[] nums) {
        int max = 0;
        int reachAble = 0;
        int count = 0;

        for (int i=0; i < nums.length; i++) {
            if (reachAble == nums.length -1) break;
            max = Math.max(max, i+nums[i]);
            if (i == reachAble) {
                reachAble = max;
                count++;
            }
        }
        return count;
    }
}
