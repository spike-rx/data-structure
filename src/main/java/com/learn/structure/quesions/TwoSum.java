package com.learn.structure.quesions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                if (valueMap.containsKey(target - nums[i])) {
                    result[1] = i;
                    result[0] = valueMap.get(target - nums[i]);
                    break;
                }
                valueMap.put(nums[i], i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int target = 0;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
