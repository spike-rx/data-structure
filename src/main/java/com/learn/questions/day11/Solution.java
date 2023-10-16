package com.learn.questions.day11;


public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {7,1,5};
        System.out.println(maxProfit(nums));

    }

    public static int maxProfit(int[] prices) {
        int miniPrice = prices[0];
        int maxProfit = 0;
        for (int i: prices) {
            maxProfit = Math.max(maxProfit, i - miniPrice);
            miniPrice = Math.min(miniPrice, i);
        }

        return maxProfit;
    }
}
