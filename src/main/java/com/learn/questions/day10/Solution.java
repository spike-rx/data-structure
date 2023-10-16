package com.learn.questions.day10;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);

    }

    public static void rotate(int[] nums, int k) {

        int lengthCount = nums.length - 1;
        Stack<Integer> numsStack = new Stack<>();
        int[] result = new int[nums.length];
        while (k >0) {
            numsStack.push(nums[lengthCount]);
            lengthCount--;
            k--;
        }
        int gap = nums.length - numsStack.size();
        int i =0;
        for(int count=0; count< nums.length; count++) {
            if (gap > 0 && numsStack.isEmpty()) {
                result[count] = nums[i];
                i++;
            }else {
                result[count] = numsStack.pop();
            }
        }
        nums = result;
        System.out.println(Arrays.toString(nums));

    }
}
