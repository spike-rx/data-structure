package com.learn.structure.questions;

import com.learn.questions.day01.SubarraySum;
import com.learn.questions.day02.MinSubArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubArraySumTest {
    public MinSubArray subarraySum;

    @BeforeEach
    void setBeforeTest() {
        subarraySum = new MinSubArray();
    }

    @Test
    @DisplayName("Test case 1")
    void testCase1() {
        int target = 7;
        int [] nums = {2,3,1,2,4,3};
         int result = subarraySum.minSubArrayLen(target, nums);
         int expected = 2;
         assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 2")
    void testCase2() {
        int target = 4;
        int [] nums = {1,4,4};
        int result = subarraySum.minSubArrayLen(target, nums);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 3")
    void testCase3() {
        int target = 11;
        int [] nums = {1,1,1,1,1,1,1,1};
        int result = subarraySum.minSubArrayLen(target, nums);
        int expected = 0;
        assertEquals(expected, result);
    }

    // {12,28,83,4,25,26,25,2,25,25,25,12}
    /*
    * [2, 4, 12, 12, 25, 25, 25, 25, 25, 26, 28, 83]
    * */
    @Test
    @DisplayName("Test case 4")
    void testCase4() {
        int target = 213;
        int [] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        System.out.println(Arrays.toString(Arrays.stream(nums).sorted().toArray()));
        int result = subarraySum.minSubArrayLen(target, nums);
        int expected = 8;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 5")
    void testCase5() {
        int target = 7;
        int [] nums = {1,1,1,1,7};
        int result = subarraySum.minSubArrayLen(target, nums);
        int expected = 1;
        assertEquals(expected, result);
    }
}
