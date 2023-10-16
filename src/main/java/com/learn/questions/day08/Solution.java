package com.learn.questions.day08;

import java.util.Arrays;

// [0,0,1,1,1,1,2,3,3]
// 0 == 1
// 0 == 1
// 1 == 1,
// 1==1
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        removeDuplicates(nums);

    }
    /*
    * i = 2, j = 2
    * i = 3, j =3,
    * i =4 , j = 3
    * */
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num: nums) {
            if (i< 2 || num > nums[i-2]) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}
